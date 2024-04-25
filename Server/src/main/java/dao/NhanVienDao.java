
package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import entity.KhachHang;
import entity.NhanVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public interface NhanVienDao extends Remote {
	public boolean addNhanVien(NhanVien nhanVien) throws RemoteException;
	public boolean updateNhanVien(NhanVien nhanVien) throws RemoteException;
	public NhanVien getNhanVienByMa(String ma) throws RemoteException;
	public NhanVien getNhanVienBySDT(String sdt) throws RemoteException;
	public NhanVien getNhanVienByCCCD(String cccd) throws RemoteException;
	public List<NhanVien> getAllNhanVien() throws RemoteException;
	public List<NhanVien> getAllNhanVienByMa(String maloai) throws RemoteException;
	public void writeToExcel(String filePath) throws RemoteException;
}
