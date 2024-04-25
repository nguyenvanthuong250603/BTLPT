package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import entity.Ve;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public interface VeDao extends Remote {
	public boolean addVe(Ve ve) throws RemoteException;
	public List<Ve> getAllVe() throws RemoteException;
	public List<Ve> getListVeByMaHD(String mahd) throws RemoteException;
	public List<Ve> getListVeByMaVe(String mv) throws RemoteException;
	public Ve getVeByMa(String ma) throws RemoteException;
	public void updateDoiVe(String maVe, LocalDateTime localDateTime) throws RemoteException;
	public List<Ve> layVeThuocMa(String ma) throws RemoteException;
}
