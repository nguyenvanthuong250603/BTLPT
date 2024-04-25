package dao.ipml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dao.KhachHangDao;
import entity.KhachHang;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class KhachHangDaoIpml extends UnicastRemoteObject implements KhachHangDao {

	private EntityManager em;

	public KhachHangDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

	// Update KhachHang
	public boolean updateKhachHang(KhachHang khachHang) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(khachHang);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public boolean addKhachHang(KhachHang kh) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(kh);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

	// Find KhachHang by Phone number
	public KhachHang getKhachHangByPhoneNumber(String sdt) throws RemoteException {
		try {
			return em.createNamedQuery("KhachHang.findSdt", KhachHang.class).setParameter("sdt", sdt).getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	// Get list KhachHang
	public List<KhachHang> getAllKhachHang() throws RemoteException {
		try {

			return em.createNamedQuery("KhachHang.findAll", KhachHang.class).getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	public KhachHang getKhachHangByCCCD(String cccd) throws RemoteException {
		try {
			return em.createNamedQuery("KhachHang.findCccd", KhachHang.class).setParameter("cccd", cccd)
					.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	public List<KhachHang> layKhachHangBanDoiTuong(String doiTuong) throws RemoteException {
		return em.createQuery("SELECT kh FROM KhachHang kh WHERE kh.doiTuong = :doiTuong", KhachHang.class)
				.setParameter("doiTuong", doiTuong).getResultList();
	}

	public List<KhachHang> layKhachHangThuocMa(String ma) throws RemoteException {
		return em.createQuery("SELECT kh FROM KhachHang kh WHERE kh.cccd like :ma ORDER BY kh.cccd DESC",
				KhachHang.class).setParameter("ma", "%" + ma + "%").getResultList();
	}

	public void writeToExcel(String filePath) throws RemoteException {
		String[] rowHead = { "CCCD", "Họ và tên", "Số điện thoại", "Email", "Đối tượng" };

		List<KhachHang> khachHang = getAllKhachHang();

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadSheet = workbook.createSheet("Khách hàng");
		Row headerRow = spreadSheet.createRow(0);

		// Creating header
		for (int i = 0; i < rowHead.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(rowHead[i]);
		}

		// Creating data rows
		for (int i = 0; i < khachHang.size(); i++) {
			Row dataRow = spreadSheet.createRow(i + 1);
			dataRow.createCell(0).setCellValue(khachHang.get(i).getCccd());
			dataRow.createCell(1).setCellValue(khachHang.get(i).getHoTen());
			dataRow.createCell(2).setCellValue(khachHang.get(i).getSdt());
			dataRow.createCell(3).setCellValue(khachHang.get(i).getEmail());
			dataRow.createCell(4).setCellValue(khachHang.get(i).getDoiTuong());
		}

		// Write the workbook in file
		FileOutputStream outputStream;
		try {
			outputStream = new FileOutputStream(new File(filePath));

			workbook.write(outputStream);
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Write to excel done...");
	}
}
