package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.ChiTietVeDao;
import dao.ChoNgoiDao;
import dao.ChuyenDao;
import dao.GaDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.KhuyenMaiDao;
import dao.NhanVienDao;
import dao.TaiKhoanDao;
import dao.TauDao;
import dao.ToaDao;
import dao.TuyenDao;
import dao.VeDao;
import dao.ipml.ChiTietVeDaoIpml;
import dao.ipml.ChoNgoiDaoIpml;
import dao.ipml.ChuyenDaoIpml;
import dao.ipml.GaDaoIpml;
import dao.ipml.HoaDonDaoIpml;
import dao.ipml.KhachHangDaoIpml;
import dao.ipml.KhuyenMaiDaoIpml;
import dao.ipml.NhanVienDaoIpml;
import dao.ipml.TaiKhoanDaoIpml;
import dao.ipml.TauDaoIpml;
import dao.ipml.ToaDaoIpml;
import dao.ipml.TuyenDaoIpml;
import dao.ipml.VeDaoIpml;

public class Server {
	private static final String URL = "rmi://DESKTOP-APQ3LQK:7401/";
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ChiTietVeDao chiTietVeDao = new ChiTietVeDaoIpml();
			ChoNgoiDao choNgoiDao = new ChoNgoiDaoIpml();
			ChuyenDao chuyenDao = new ChuyenDaoIpml();
			GaDao gaDao = new GaDaoIpml();
			HoaDonDao hoaDonDao = new HoaDonDaoIpml();
			KhachHangDao khachHangDao = new KhachHangDaoIpml();
			KhuyenMaiDao khuyenMaiDao = new KhuyenMaiDaoIpml();
			NhanVienDao nhanVienDao = new NhanVienDaoIpml();
			TaiKhoanDao taiKhoanDao = new TaiKhoanDaoIpml();
			TauDao tauDao = new TauDaoIpml();
			ToaDao toaDao = new ToaDaoIpml();
			TuyenDao tuyenDao = new TuyenDaoIpml();
			VeDao veDao = new VeDaoIpml();
			LocateRegistry.createRegistry(7401);
			context.bind(URL+"chiTietVeDao", chiTietVeDao);
			context.bind(URL+"choNgoiDao", choNgoiDao);
			context.bind(URL+"chuyenDao", chuyenDao);
			context.bind(URL+"gaDao", gaDao);
			context.bind(URL+"hoaDonDao", hoaDonDao);
			context.bind(URL+"khachHangDao", khachHangDao);
			context.bind(URL+"khuyenMaiDao", khuyenMaiDao);
			context.bind(URL+"nhanVienDao", nhanVienDao);
			context.bind(URL+"taiKhoanDao", taiKhoanDao);
			context.bind(URL+"tauDao", tauDao);
			context.bind(URL+"toaDao", toaDao);
			context.bind(URL+"tuyenDao", tuyenDao);
			context.bind(URL+"veDao", veDao);
			System.out.println("Server is running...");
			
		} catch (NamingException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
