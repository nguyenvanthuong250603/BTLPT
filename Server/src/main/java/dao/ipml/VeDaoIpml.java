package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.util.List;

import dao.VeDao;
import entity.Ve;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class VeDaoIpml extends UnicastRemoteObject implements VeDao {

	private EntityManager em;

	public VeDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

	// Thêm Vé
	public boolean addVe(Ve ve) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(ve);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

	// lấy danh sách vé
	public List<Ve> getAllVe() throws RemoteException {
		return em.createNamedQuery("Ve.findAll", Ve.class).getResultList();
	}

	public List<Ve> getListVeByMaHD(String mahd) throws RemoteException {
		return em.createNamedQuery("Ve.FindByMaHd", Ve.class).setParameter("mhd", mahd).getResultList();
	}

	public List<Ve> getListVeByMaVe(String mv) throws RemoteException {
		return em.createNamedQuery("Ve.FindByMaVe", Ve.class).setParameter("mv", mv).getResultList();
	}

//	    lấy Vé bằng mã
	public Ve getVeByMa(String ma) throws RemoteException {
		return em.find(Ve.class, ma);
	}

	public void updateDoiVe(String maVe, LocalDateTime localDateTime) throws RemoteException {
		EntityTransaction transaction = null;
		try {
			transaction = em.getTransaction();
			transaction.begin();

			em.createNamedQuery("Ve.updateDoiTra").setParameter("newThoiGianLenTau", localDateTime)
					.setParameter("newTrangThai", false).setParameter("maVe", maVe).executeUpdate();

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public List<Ve> layVeThuocMa(String ma) throws RemoteException {
		return em.createQuery("SELECT v FROM Ve v WHERE v.maVe like :maVe", Ve.class)
				.setParameter("maVe", "%" + ma + "%").getResultList();
	}
}
