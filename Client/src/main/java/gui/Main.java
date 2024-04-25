package gui;

import component.Herder;
import component.Menu;
import entity.TaiKhoan;
import event.EventMenuSelected;
import form.MainForm;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import model.AllDao;

import java.rmi.RemoteException;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

public class Main extends javax.swing.JFrame {

	private MigLayout layout;
	private Menu menu;
	private Herder herder;
	private MainForm main;

	private AllDao allDao;
	private TaiKhoan taiKhoan;

	public Main(AllDao allDao, TaiKhoan taiKhoan) {
		this.allDao = allDao;
		this.taiKhoan = taiKhoan;
		initComponents();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setLocation(0, 0);
		setResizable(false);
		init();

	}

	public void init() {
		layout = new MigLayout("fill", "0[]0[100%,fill]0", "0[fill,top]0");
		bg.setLayout(layout);
		menu = new Menu();
		herder = new Herder(taiKhoan.getNhanVien().getHoTen(), taiKhoan.getNhanVien().getLoaiNV());
		main = new MainForm();
		menu.addEvent(new EventMenuSelected() {
			@Override
			public void menuSelected(int menuIndex, int subMenuIndex) throws RemoteException {

				switch (menuIndex) {
				case 0:
					switch (subMenuIndex) {
					case 0:
						main.showForm(new GD_MuaVe(allDao,taiKhoan));
						menu.hideallMenu();
						break;
					case 1:
						main.showForm(new GD_DoiTra(allDao));
						menu.hideallMenu();
						break;
					}
					break;
				case 1:
					main.showForm(new GD_QuanLyKhachHang(allDao));
					menu.hideallMenu();
					break;
				case 2:
					main.showForm(new GD_QuanLyNhanVien(allDao));
					menu.hideallMenu();
					break;
				case 3:
					switch (subMenuIndex) {
					case 0:
						main.showForm(new GD_KhuyenMaiHoaDon(allDao));
						menu.hideallMenu();
						break;
					case 1:
						main.showForm(new GD_KhuyenMaiTrenKhachHang(allDao));
						menu.hideallMenu();
						break;

					}
					break;
				case 4:
					switch (subMenuIndex) {
					case 0:
						main.showForm(new GD_ThongKe());
						menu.hideallMenu();
						break;
					case 1:
						main.showForm(new GD_ThongKe());
						menu.hideallMenu();
						break;
					case 2:
						main.showForm(new GD_ThongKe());
						menu.hideallMenu();
						break;
					case 3:
						main.showForm(new GD_ThongKe());
						menu.hideallMenu();
						break;
					}
					break;
				case 5:
					switch (subMenuIndex) {
					case 0:
						main.showForm(new GD_TraCuuNhanVien(allDao));
						menu.hideallMenu();
						break;
					case 1:
						main.showForm(new GD_TraCuuKhuyenMai(allDao));
						menu.hideallMenu();
						break;
					
					}
				}
			}

		});
		menu.initMenuItem();
		bg.add(menu, "w 300!, spany 2");
		bg.add(herder, "h 100!,wrap");
		bg.add(main, "w 100%, h 100%");

		main.add(new GD_Chinh());
	}

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		bg = new javax.swing.JLayeredPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Ứng dụng bán vé tàu tại đại lý Aplus");
		setPreferredSize(new java.awt.Dimension(2000, 1100));

		bg.setOpaque(true);

		javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
		bg.setLayout(bgLayout);
		bgLayout.setHorizontalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				1712, Short.MAX_VALUE));
		bgLayout.setVerticalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				1129, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main().setVisible(true);
//            }
//        });
//    }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLayeredPane bg;
	// End of variables declaration//GEN-END:variables
}
