package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.ChoNgoi;
import entity.Toa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public interface ToaDao extends Remote {
	public Toa getToaByMa(String ma) throws RemoteException;
	public List<Toa> getAllToa() throws RemoteException;
	public List<Toa> getAllToaByMaChuyen(String maTau) throws RemoteException;
	public Toa layToaCoChoNgoiTrong(int id1, int id2, String maChuyen, boolean trangThai) throws RemoteException;
	
}
