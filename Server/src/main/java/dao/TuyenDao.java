package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.Tuyen;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public interface TuyenDao extends Remote {
	public Tuyen getTuyenByMa(String ma) throws RemoteException;
    public List<Tuyen> getAllTuyen() throws RemoteException;
    public List<String> layTuyenChuaGa(int id1, int id2) throws RemoteException;
}
