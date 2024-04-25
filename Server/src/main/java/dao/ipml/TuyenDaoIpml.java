package dao.ipml;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dao.TuyenDao;
import entity.Tuyen;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TuyenDaoIpml extends UnicastRemoteObject implements TuyenDao {

	private EntityManager em;

	public TuyenDaoIpml() throws RemoteException {
		em = Persistence.createEntityManagerFactory("Server").createEntityManager();
	}

//    lấy Tuyen bằng mã
	public Tuyen getTuyenByMa(String ma) throws RemoteException {
		return em.find(Tuyen.class, ma);
	}

//    lấy toàn bộ danh sách Tuyến
	public List<Tuyen> getAllTuyen() throws RemoteException {
		return em.createNamedQuery("Tuyen.findAll", Tuyen.class).getResultList();
	}

	public List<String> layTuyenChuaGa(int id1, int id2) throws RemoteException {
		return em.createQuery(
				"SELECT t.maTuyen FROM Tuyen t JOIN t.listGas ctt WHERE ctt.id = :id1 OR ctt.id = :id2 GROUP BY t.maTuyen",
				String.class).setParameter("id1", id1).setParameter("id2", id2).getResultList();
	}
}
