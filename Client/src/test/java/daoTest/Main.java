package daoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dao.NhanVienDao;
import dao.TaiKhoanDao;
import entity.NhanVien;
import entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



@TestInstance(Lifecycle.PER_CLASS)
public class Main {
	private EntityManagerFactory emf;
	private TaiKhoanDao taiKhoanDao;
	private NhanVienDao nhanVienDao;
	
	@BeforeAll
	void setUp() {
		emf = Persistence.createEntityManagerFactory("SourceMSSQL");
		taiKhoanDao = new TaiKhoanDao(emf);
		nhanVienDao = new NhanVienDao(emf);
	}
	
//	@Test
//	void TestTaiKhoan() {
//		TaiKhoan taiKhoan = taiKhoanDao.getTaiKhoanByUserName("21030001");
//		assertNotNull(taiKhoan);
//		assertEquals(taiKhoan.getMatKhau(), "Passw0rd");
//		
//		System.out.println(taiKhoan);
//	}
	
	
	@Test
	void TestNhanVien() {
		NhanVien list = nhanVienDao.getNhanVienByMa("NV21990005");
//		assertEquals(list.getMaNhanVien(), "NV21990005");
		System.err.println(list.getTaiKhoan().getNhanVien());
	}
	
	void down() {
		emf.close();
	}
}
