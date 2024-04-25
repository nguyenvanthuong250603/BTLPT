
package dao;

import entity.KhachHang;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public interface KhachHangDao extends Remote {
	public boolean updateKhachHang(KhachHang khachHang) throws RemoteException;
	public boolean addKhachHang(KhachHang kh) throws RemoteException;
	public KhachHang getKhachHangByPhoneNumber(String sdt) throws RemoteException;
	public List<KhachHang> getAllKhachHang() throws RemoteException;
	public KhachHang getKhachHangByCCCD(String cccd) throws RemoteException;
	public List<KhachHang> layKhachHangBanDoiTuong(String doiTuong) throws RemoteException;
	public List<KhachHang> layKhachHangThuocMa(String ma) throws RemoteException;
	public void writeToExcel(String filePath) throws RemoteException;
}

















