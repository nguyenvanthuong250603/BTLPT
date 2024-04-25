package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.ChoNgoi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public interface ChoNgoiDao extends Remote {
	public ChoNgoi getChoNgoiByMa(String ma) throws RemoteException;
	public List<ChoNgoi> getAllChoNgoi() throws RemoteException;
	public List<ChoNgoi> getAllChoNgoiTrong(int id1, int id2, String maChuyen, boolean trangThai) throws RemoteException;
	public List<ChoNgoi> getAllChoNgoiTrongVTToa(int id1, int id2, String maChuyen, int viTri, boolean trangThai) throws RemoteException;
}
