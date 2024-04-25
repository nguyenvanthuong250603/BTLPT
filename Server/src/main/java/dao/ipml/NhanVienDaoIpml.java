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

import dao.NhanVienDao;
import entity.NhanVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class NhanVienDaoIpml extends UnicastRemoteObject implements NhanVienDao {

	private EntityManager em;

	public NhanVienDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

//    Thêm nhân viên
	public boolean addNhanVien(NhanVien nhanVien) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(nhanVien);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

//    cập nhật nhân viên
	public boolean updateNhanVien(NhanVien nhanVien) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(nhanVien);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

//    lấy nhân viên bằng mã
	public NhanVien getNhanVienByMa(String ma) throws RemoteException {
		return em.find(NhanVien.class, ma);
	}

//    lấy nhân viên bằng số điện thoại
	public NhanVien getNhanVienBySDT(String sdt) throws RemoteException {
		return em.createNamedQuery("NhanVien.findSdt", NhanVien.class).setParameter("sdt", sdt).getSingleResult();
	}

//    Lấy nhân viên bằng căn cước công dân
	public NhanVien getNhanVienByCCCD(String cccd) throws RemoteException {
		try {
			return em.createNamedQuery("NhanVien.findCccd", NhanVien.class).setParameter("cccd", cccd)
					.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

//    lấy toàn bộ danh sách nhân viên
	public List<NhanVien> getAllNhanVien() throws RemoteException {
		try {

			return em.createNamedQuery("NhanVien.findAll", NhanVien.class).setParameter("loai", "User").getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	public List<NhanVien> getAllNhanVienByMa(String maloai) throws RemoteException {
		return em.createNamedQuery("NhanVien.findAllByMa", NhanVien.class).setParameter("ma", "%" + maloai + "%")
				.getResultList();
	}

	public void writeToExcel(String filePath) throws RemoteException {
		String[] rowHead = { "Mã nhân viên", "CCCD", "Họ và tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Email",
				"Số điện thoại", "Trạng thái" };

		List<NhanVien> nhanVien = getAllNhanVien();

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadSheet = workbook.createSheet("Nhân viên");
		Row headerRow = spreadSheet.createRow(0);

		// Creating header
		for (int i = 0; i < rowHead.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(rowHead[i]);
		}

		// Creating data rows
		for (int i = 0; i < nhanVien.size(); i++) {
			Row dataRow = spreadSheet.createRow(i + 1);
			dataRow.createCell(0).setCellValue(nhanVien.get(i).getMaNhanVien());
			dataRow.createCell(1).setCellValue(nhanVien.get(i).getCccd());
			dataRow.createCell(2).setCellValue(nhanVien.get(i).getHoTen());
			dataRow.createCell(3).setCellValue(nhanVien.get(i).getNgaySinh());
			dataRow.createCell(4).setCellValue(nhanVien.get(i).isGioiTinh() ? "Nam" : "Nữ");
			dataRow.createCell(5).setCellValue(nhanVien.get(i).getDiaChi());
			dataRow.createCell(6).setCellValue(nhanVien.get(i).getEmail());
			dataRow.createCell(7).setCellValue(nhanVien.get(i).getSdt());
			dataRow.createCell(8).setCellValue(nhanVien.get(i).getTrangThai() ? "Đang làm" : "Nghỉ");
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
