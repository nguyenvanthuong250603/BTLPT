package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import dao.KhuyenMaiDao;
import entity.KhuyenMai;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class KhuyenMaiDaoIpml extends UnicastRemoteObject implements KhuyenMaiDao {

	private EntityManager em;

	public KhuyenMaiDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

	public boolean updateKhuyenMai(KhuyenMai khuyenMai) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(khuyenMai);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	public boolean addKhuyenMai(KhuyenMai khuyenMai) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(khuyenMai);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	// lấy Khuyến mãi bằng mã
	public KhuyenMai getKhuyenMaiByMa(String ma) throws RemoteException {
		return em.find(KhuyenMai.class, ma);
	}

	// lấy toàn bộ danh sách khuyến mãi
	public List<KhuyenMai> getAllKhuyenMai() throws RemoteException {
		return em.createNamedQuery("KhuyenMai.findAll", KhuyenMai.class).getResultList();
	}

	// lấy toàn bộ danh sách khuyến mãi khach hang
	public List<String> getAllKhuyenMaiKHLoai() throws RemoteException {
		return em.createQuery(
				"select km.loaiKhuyenMai from KhuyenMai km where km.loaiKhuyenMai != :loai GROUP BY km.loaiKhuyenMai",
				String.class).setParameter("loai", "KMHD").getResultList();
	}

	public List<KhuyenMai> getAllKhuyenMaiKH() throws RemoteException {
		return em.createNamedQuery("KhuyenMai.findAllKMKH", KhuyenMai.class).setParameter("loai", "KMHD")
				.getResultList();
	}

	// lấy toàn bộ danh sách khuyến mãi tren hoa don
	public List<KhuyenMai> getAllKhuyenMaiHD() throws RemoteException {
		return em.createNamedQuery("KhuyenMai.findAllKMHD", KhuyenMai.class).setParameter("loai", "KMHD")
				.getResultList();
	}

	public List<KhuyenMai> getAllKhuyenMaiByNumber(String ma) throws RemoteException {
		return em.createNamedQuery("KhuyenMai.findAllKMNB", KhuyenMai.class).setParameter("ma", "%" + ma + "%")
				.getResultList();
	}

	public List<KhuyenMai> getKhuyenMaiByLoaiKhuyenMaiKH(String loai) throws RemoteException {
		return em.createQuery("SELECT km FROM KhuyenMai km WHERE km.loaiKhuyenMai = :loai", KhuyenMai.class)
				.setParameter("loai", loai).getResultList();

	}

	public KhuyenMai layKhuyenMaiTotNhatBangLoai(int soLuong) throws RemoteException {
		try {
			return em.createQuery(
					"SELECT km FROM KhuyenMai km WHERE AND km.soLuongVe <= :soLuong km.loaiKhuyenMai = :loai AND km.trangThai = :trangThai AND km.thoiGianKetThuc > :date ORDER BY km.soLuongVe DESC",
					KhuyenMai.class).setParameter("soLuong", soLuong).setParameter("loai", "KMKH")
					.setParameter("trangThai", true).setParameter("date", Date.from(Instant.now())).setMaxResults(1)
					.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public KhuyenMai layKhuyenMaiTotNhatBangLoai(String loai) throws RemoteException {
		try {
			return em.createQuery(
					"SELECT km FROM KhuyenMai km WHERE km.loaiKhuyenMai = :loai AND km.trangThai = :trangThai AND km.thoiGianKetThuc > :date ORDER BY km.chietKhau DESC",
					KhuyenMai.class).setParameter("loai", loai).setParameter("trangThai", true)
					.setParameter("date", Date.from(Instant.now())).setMaxResults(1).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
