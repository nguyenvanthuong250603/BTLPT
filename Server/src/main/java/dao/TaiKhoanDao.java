package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public interface TaiKhoanDao extends Remote {
	public List<TaiKhoan> getAllTaiKhoan() throws RemoteException;
	public TaiKhoan getTaiKhoanByUserName(String userName) throws RemoteException;
	public boolean updateTaiKhoan(TaiKhoan taiKhoan) throws RemoteException;
	public boolean addTaiKhoan(TaiKhoan taiKhoan) throws RemoteException;
	
}
