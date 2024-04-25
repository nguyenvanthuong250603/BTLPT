package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.ChiTietVe;

public interface ChiTietVeDao extends Remote {
	public boolean addChiTietVe(ChiTietVe ctv) throws RemoteException;
} 
