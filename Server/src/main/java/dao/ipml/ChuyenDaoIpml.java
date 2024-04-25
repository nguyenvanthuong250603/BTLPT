package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;

import dao.ChuyenDao;
import entity.Chuyen;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ChuyenDaoIpml extends UnicastRemoteObject implements ChuyenDao {

	private EntityManager em;

	public ChuyenDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

	// lấy Chuyến bằng mã
	public Chuyen getChuyenByMa(String ma) throws RemoteException {
		return em.find(Chuyen.class, ma);
	}

	// lấy Chuyến bằng tên
	public Chuyen getChuyenByTen(String ten) throws RemoteException {
		return em.find(Chuyen.class, ten);
	}

	// lấy toàn bộ danh sách Chuyến
	public List<Chuyen> getAllChuyenByNgay(LocalDate ngay, boolean chieu, String maTuyen) throws RemoteException {
		return em.createQuery(
				"SELECT c FROM Chuyen c WHERE c.ngayKhoiHanh = :ngay AND c.chieu = :chieu AND c.tuyen.maTuyen = :maTuyen",
				Chuyen.class).setParameter("ngay", ngay).setParameter("chieu", chieu).setParameter("maTuyen", maTuyen)
				.getResultList();
	}
}
