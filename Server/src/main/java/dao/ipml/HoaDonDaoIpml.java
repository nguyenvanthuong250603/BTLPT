package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;

import dao.HoaDonDao;
import entity.HoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class HoaDonDaoIpml extends UnicastRemoteObject implements HoaDonDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityManager em;

	public HoaDonDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
		// TODO Auto-generated constructor stub
	}

//  Thêm Hóa Đơn

	public boolean addHoaDon(HoaDon hoaDon) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(hoaDon);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();

			e.printStackTrace();
		}
		return false;
	}

//  lấy Hoa Don bằng mã
	public HoaDon getHoaDonByMa(String ma) throws RemoteException {
		return em.find(HoaDon.class, ma);
	}

//lấy toàn bộ danh sách HoaDon
	public List<HoaDon> getAllHoaDon() throws RemoteException {
		return em.createNamedQuery("HoaDon.findAll", HoaDon.class).getResultList();
	}

	public List<HoaDon> layHoaDonTam() throws RemoteException {
		LocalDate ngayHienTai = LocalDate.now();
		return em.createQuery("SELECT hd FROM HoaDon hd WHERE hd.trangThai = false AND hd.ngayTao = :ngayTao",
				HoaDon.class).setParameter("ngayTao", ngayHienTai).getResultList();
	}

	public List<HoaDon> layHoaDonThuocMa(String ma) throws RemoteException {
		return em.createQuery("SELECT hd FROM HoaDon hd WHERE hd.maHoaDon like :ma", HoaDon.class)
				.setParameter("ma", "%" + ma + "%").getResultList();
	}

}
