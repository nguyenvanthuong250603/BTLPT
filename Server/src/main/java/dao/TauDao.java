package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.Tau;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public interface TauDao extends Remote {
	public Tau getTauByMa(String ma) throws RemoteException;
	public List<Tau> getAllTau() throws RemoteException;
	    
}
