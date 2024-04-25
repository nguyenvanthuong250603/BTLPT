package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.Ga;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public interface GaDao extends Remote {
	public List<Ga> getAllGa() throws RemoteException;
	public Ga getGaByTen(String ten) throws RemoteException;
	public Ga layGaDau() throws RemoteException;
	public Ga layGaCuoi() throws RemoteException;
	
}
