package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dao.TauDao;
import entity.Tau;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TauDaoIpml extends UnicastRemoteObject implements TauDao {
	private EntityManager em;

	public TauDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

//    lấy Tàu bằng mã
	public Tau getTauByMa(String ma) throws RemoteException {
		return em.find(Tau.class, ma);
	}

//    lấy toàn bộ danh sách tàu
	public List<Tau> getAllTau() throws RemoteException {
		return em.createNamedQuery("Tau.findAll", Tau.class).getResultList();
	}
}
