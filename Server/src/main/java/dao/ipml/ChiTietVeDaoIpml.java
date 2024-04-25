package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.ChiTietVeDao;
import entity.ChiTietVe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ChiTietVeDaoIpml extends UnicastRemoteObject implements ChiTietVeDao {

	private EntityManager em;

	public ChiTietVeDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

	public boolean addChiTietVe(ChiTietVe ctv) throws RemoteException {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(ctv);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return false;
	}
}
