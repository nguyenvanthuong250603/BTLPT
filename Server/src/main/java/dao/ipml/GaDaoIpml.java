package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dao.GaDao;
import entity.Ga;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GaDaoIpml extends UnicastRemoteObject implements GaDao {
	public GaDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityManager em;

//  lấy toàn bộ danh sách Ga
	public List<Ga> getAllGa() throws RemoteException {
		return em.createQuery("SELECT g FROM Ga g", Ga.class).getResultList();
	}

//  lấy Vé bằng tên
	public Ga getGaByTen(String ten) throws RemoteException {
		try {
			return em.createQuery("SELECT g FROM Ga g WHERE g.tenGa = :tenGa", Ga.class).setParameter("tenGa", ten)
					.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public Ga layGaDau() throws RemoteException {
		return em.createQuery("SELECT g FROM Ga g WHERE g.id = :id", Ga.class).setParameter("id", 1).getSingleResult();
	}

	public Ga layGaCuoi() throws RemoteException {
		return em.createQuery("SELECT g FROM Ga g WHERE g.id = :id", Ga.class).setParameter("id", 20).getSingleResult();
	}

}
