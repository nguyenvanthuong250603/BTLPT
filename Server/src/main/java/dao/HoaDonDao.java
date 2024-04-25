package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;

import entity.HoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public interface HoaDonDao extends Remote {
	public boolean addHoaDon(HoaDon hoaDon) throws RemoteException;
	public HoaDon getHoaDonByMa(String ma) throws RemoteException;
	public List<HoaDon> getAllHoaDon() throws RemoteException;
	public List<HoaDon> layHoaDonTam() throws RemoteException;
	public List<HoaDon> layHoaDonThuocMa(String ma) throws RemoteException;
}
