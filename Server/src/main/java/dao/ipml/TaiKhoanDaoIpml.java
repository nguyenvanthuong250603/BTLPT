package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dao.TaiKhoanDao;
import entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TaiKhoanDaoIpml extends UnicastRemoteObject implements TaiKhoanDao {

	private EntityManager em;

	public TaiKhoanDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

//    Them tai khoan
	public boolean addTaiKhoan(TaiKhoan taiKhoan) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(taiKhoan);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

//    UpDateTaiKhoan
	public boolean updateTaiKhoan(TaiKhoan taiKhoan) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(taiKhoan);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public TaiKhoan getTaiKhoanByUserName(String userName) throws RemoteException {
		return em.find(TaiKhoan.class, userName);

	}

	public List<TaiKhoan> getAllTaiKhoan() throws RemoteException {
		return em.createNamedQuery("TaiKhoan.findAll", TaiKhoan.class).getResultList();
	}
}
