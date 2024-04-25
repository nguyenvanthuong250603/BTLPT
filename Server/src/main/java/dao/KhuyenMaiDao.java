package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import entity.KhuyenMai;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public interface KhuyenMaiDao extends Remote {
	public boolean updateKhuyenMai(KhuyenMai khuyenMai) throws RemoteException;
	public boolean addKhuyenMai(KhuyenMai khuyenMai) throws RemoteException;
	public KhuyenMai getKhuyenMaiByMa(String ma) throws RemoteException;
	public List<KhuyenMai> getAllKhuyenMai() throws RemoteException;
	public List<String> getAllKhuyenMaiKHLoai() throws RemoteException;
	public List<KhuyenMai> getAllKhuyenMaiKH() throws RemoteException;
	public List<KhuyenMai> getAllKhuyenMaiHD() throws RemoteException;
	public List<KhuyenMai> getAllKhuyenMaiByNumber(String ma) throws RemoteException;
	public List<KhuyenMai> getKhuyenMaiByLoaiKhuyenMaiKH(String loai) throws RemoteException;
	public KhuyenMai layKhuyenMaiTotNhatBangLoai(int soLuong) throws RemoteException;
	public KhuyenMai layKhuyenMaiTotNhatBangLoai(String loai) throws RemoteException;
}
