package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;

import entity.Chuyen;

public interface ChuyenDao extends Remote{
	public Chuyen getChuyenByMa(String ma) throws RemoteException;
	public Chuyen getChuyenByTen(String ten) throws RemoteException;
	public List<Chuyen> getAllChuyenByNgay(LocalDate ngay,boolean chieu,String maTuyen) throws RemoteException;
}
