package model;

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

public class AllDao {
	private ChiTietVeDao chiTietVeDao;
	private ChoNgoiDao choNgoiDao;
	private ChuyenDao chuyenDao;
	private GaDao gaDao;
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private KhuyenMaiDao khuyenMaiDao;
	private NhanVienDao nhanVienDao;
	private TaiKhoanDao taiKhoanDao;
	private TauDao tauDao;
	private TuyenDao tuyenDao;
	private VeDao veDao;
	private ToaDao toaDao;

	public AllDao() {

	}

	

	public AllDao(ChiTietVeDao chiTietVeDao, ChoNgoiDao choNgoiDao, ChuyenDao chuyenDao, GaDao gaDao,
			HoaDonDao hoaDonDao, KhachHangDao khachHangDao, KhuyenMaiDao khuyenMaiDao, NhanVienDao nhanVienDao,
			TaiKhoanDao taiKhoanDao, TauDao tauDao, TuyenDao tuyenDao, VeDao veDao, ToaDao toaDao) {
		super();
		this.chiTietVeDao = chiTietVeDao;
		this.choNgoiDao = choNgoiDao;
		this.chuyenDao = chuyenDao;
		this.gaDao = gaDao;
		this.hoaDonDao = hoaDonDao;
		this.khachHangDao = khachHangDao;
		this.khuyenMaiDao = khuyenMaiDao;
		this.nhanVienDao = nhanVienDao;
		this.taiKhoanDao = taiKhoanDao;
		this.tauDao = tauDao;
		this.tuyenDao = tuyenDao;
		this.veDao = veDao;
		this.toaDao = toaDao;
	}



	public ChiTietVeDao getChiTietVeDao() {
		return chiTietVeDao;
	}

	public void setChiTietVeDao(ChiTietVeDao chiTietVeDao) {
		this.chiTietVeDao = chiTietVeDao;
	}

	public ChoNgoiDao getChoNgoiDao() {
		return choNgoiDao;
	}

	public void setChoNgoiDao(ChoNgoiDao choNgoiDao) {
		this.choNgoiDao = choNgoiDao;
	}

	public ChuyenDao getChuyenDao() {
		return chuyenDao;
	}

	public void setChuyenDao(ChuyenDao chuyenDao) {
		this.chuyenDao = chuyenDao;
	}

	public GaDao getGaDao() {
		return gaDao;
	}

	public void setGaDao(GaDao gaDao) {
		this.gaDao = gaDao;
	}

	public HoaDonDao getHoaDonDao() {
		return hoaDonDao;
	}

	public void setHoaDonDao(HoaDonDao hoaDonDao) {
		this.hoaDonDao = hoaDonDao;
	}

	public KhachHangDao getKhachHangDao() {
		return khachHangDao;
	}

	public void setKhachHangDao(KhachHangDao khachHangDao) {
		this.khachHangDao = khachHangDao;
	}

	public KhuyenMaiDao getKhuyenMaiDao() {
		return khuyenMaiDao;
	}

	public void setKhuyenMaiDao(KhuyenMaiDao khuyenMaiDao) {
		this.khuyenMaiDao = khuyenMaiDao;
	}

	public NhanVienDao getNhanVienDao() {
		return nhanVienDao;
	}

	public void setNhanVienDao(NhanVienDao nhanVienDao) {
		this.nhanVienDao = nhanVienDao;
	}

	public TaiKhoanDao getTaiKhoanDao() {
		return taiKhoanDao;
	}

	public void setTaiKhoanDao(TaiKhoanDao taiKhoanDao) {
		this.taiKhoanDao = taiKhoanDao;
	}

	public TauDao getTauDao() {
		return tauDao;
	}

	public void setTauDao(TauDao tauDao) {
		this.tauDao = tauDao;
	}

	public TuyenDao getTuyenDao() {
		return tuyenDao;
	}

	public void setTuyenDao(TuyenDao tuyenDao) {
		this.tuyenDao = tuyenDao;
	}

	public VeDao getVeDao() {
		return veDao;
	}

	public void setVeDao(VeDao veDao) {
		this.veDao = veDao;
	}



	public ToaDao getToaDao() {
		return toaDao;
	}

	public void setToaDao(ToaDao toaDao) {
		this.toaDao = toaDao;
	}

	
}
