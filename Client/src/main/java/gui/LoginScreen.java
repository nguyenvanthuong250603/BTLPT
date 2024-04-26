package gui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

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
import entity.TaiKhoan;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.AllDao;

public class LoginScreen extends javax.swing.JFrame {

	private static final String URL = "rmi://192.168.79.83:7401/";
	private TaiKhoan taiKhoan;
	private AllDao allDao;

	public LoginScreen() throws MalformedURLException, RemoteException, NotBoundException {
		initComponents();
		ChiTietVeDao chiTietVeDao = (ChiTietVeDao) Naming.lookup(URL + "chiTietVeDao");
		ChoNgoiDao choNgoiDao = (ChoNgoiDao) Naming.lookup(URL + "choNgoiDao");
		GaDao gaDao = (GaDao) Naming.lookup(URL + "gaDao");
		ChuyenDao chuyenDao = (ChuyenDao) Naming.lookup(URL + "chuyenDao");
		HoaDonDao hoaDonDao = (HoaDonDao) Naming.lookup(URL + "hoaDonDao");
		KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup(URL + "khachHangDao");
		KhuyenMaiDao khuyenMaiDao = (KhuyenMaiDao) Naming.lookup(URL + "khuyenMaiDao");
		NhanVienDao nhanVienDao = (NhanVienDao) Naming.lookup(URL + "nhanVienDao");
		TauDao tauDao = (TauDao) Naming.lookup(URL + "tauDao");
		ToaDao toaDao = (ToaDao) Naming.lookup(URL + "toaDao");
		TuyenDao tuyenDao = (TuyenDao) Naming.lookup(URL + "tuyenDao");
		TaiKhoanDao taiKhoanDao = (TaiKhoanDao) Naming.lookup(URL + "taiKhoanDao");
		VeDao veDao = (VeDao) Naming.lookup(URL + "veDao");
		this.allDao = new AllDao(chiTietVeDao, choNgoiDao, chuyenDao, gaDao, hoaDonDao, khachHangDao, khuyenMaiDao,
				nhanVienDao, taiKhoanDao, tauDao, tuyenDao, veDao, toaDao);
		txtusername.setBackground(new java.awt.Color(0, 0, 0, 1));
		txtpassword.setBackground(new java.awt.Color(0, 0, 0, 1));
		txtusername.setText("21030001");
		txtpassword.setText("Passw0rd");
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel12 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		txtusername = new javax.swing.JTextField();
		underPass = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		txtpassword = new javax.swing.JPasswordField();
		underUser = new javax.swing.JLabel();
		disable = new javax.swing.JLabel();
		show = new javax.swing.JLabel();
		btnDangNhap = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		error = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel12.setBackground(new java.awt.Color(255, 255, 255));
		jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(204, 204, 255));
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("By Aplus Agent");
		getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, -1));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/imgLogin.jpg"))); // NOI18N
		jLabel1.setText("jLabel1");
		jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
		jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/closeLoginIcon.png"))); // NOI18N
		jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel2MouseClicked(evt);
			}
		});
		jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 30, 30));

		jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel5.setText("Tài khoản");
		jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 30));

		txtusername.setBackground(new java.awt.Color(204, 204, 204));
		txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize() + 2f));
		txtusername.setBorder(null);
		txtusername.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				txtusernameMouseClicked(evt);
			}
		});
		txtusername.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtusernameActionPerformed(evt);
			}
		});
		jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 30));

		underPass.setText("_________________________________");
		underPass.setPreferredSize(new java.awt.Dimension(200, 15));
		jPanel2.add(underPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 260, 30));

		jLabel7.setBackground(new java.awt.Color(255, 255, 255));
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userIcon.png"))); // NOI18N
		jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 50, 50));

		jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel8.setText("Mật khẩu");
		jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 30));

		txtpassword.setBackground(new java.awt.Color(204, 204, 204));
		txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize() + 2f));
		txtpassword.setBorder(null);
		txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
		txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				txtpasswordMouseClicked(evt);
			}
		});
		txtpassword.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtpasswordActionPerformed(evt);
			}
		});
		jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 30));

		underUser.setText("_________________________________");
		underUser.setPreferredSize(new java.awt.Dimension(200, 15));
		jPanel2.add(underUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 30));

		disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/disableIcon.png"))); // NOI18N
		disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		disable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				disableMouseClicked(evt);
			}
		});
		jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 50, 50));

		show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showIcon.png"))); // NOI18N
		show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		show.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				showMouseClicked(evt);
			}
		});
		jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 50, 50));

		btnDangNhap.setBackground(new java.awt.Color(153, 153, 255));
		btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		btnDangNhap.setText("Đăng nhập");
		btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDangNhapActionPerformed(evt);
			}
		});
		jPanel2.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 170, 40));

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logoLogin.png"))); // NOI18N
		jLabel3.setText("jLabel3");
		jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 200, 200));

		error.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
		error.setForeground(new java.awt.Color(255, 0, 0));
		jPanel2.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

		getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 370, 440));

		setSize(new java.awt.Dimension(871, 441));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked
		System.exit(0);
	}// GEN-LAST:event_jLabel2MouseClicked

	private void disableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_disableMouseClicked
		txtpassword.setEchoChar((char) 0);
		disable.setVisible(false);
		disable.setEnabled(false);
		show.setEnabled(true);
		show.setEnabled(true);
	}// GEN-LAST:event_disableMouseClicked

	private void showMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_showMouseClicked
		txtpassword.setEchoChar((char) 8226);
		disable.setVisible(true);
		disable.setEnabled(true);
		show.setEnabled(false);
		show.setEnabled(false);
	}// GEN-LAST:event_showMouseClicked

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		for (double i = 0.0; i <= 1.0; i = i + 0.1) {
			String val = i + "";
			float f = Float.valueOf(val);
			this.setOpacity(f);
			try {
				Thread.sleep(50);
			} catch (Exception e) {

			}
		}
	}// GEN-LAST:event_formWindowOpened

	private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDangNhapActionPerformed

		String userName = txtusername.getText();
		String passWord = new String(txtpassword.getPassword());
		try {
			taiKhoan = allDao.getTaiKhoanDao().getTaiKhoanByUserName(userName);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (taiKhoan != null && taiKhoan.getMatKhau().equalsIgnoreCase(passWord)) {
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new Main(allDao, taiKhoan).setVisible(true);
					setVisible(false);
				}
			});
		} else {
			error.setText("Tên tài khoản hoặc mật khẩu không chính xác");
		}

	}// GEN-LAST:event_btnDangNhapActionPerformed

	private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtpasswordActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtpasswordActionPerformed

	private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtusernameActionPerformed

	}// GEN-LAST:event_txtusernameActionPerformed

	private void txtusernameMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtusernameMouseClicked
		error.setText("");
	}// GEN-LAST:event_txtusernameMouseClicked

	private void txtpasswordMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtpasswordMouseClicked
		error.setText("");
	}// GEN-LAST:event_txtpasswordMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LoginScreen().setVisible(true);
				} catch (MalformedURLException | RemoteException | NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnDangNhap;
	private javax.swing.JLabel disable;
	private javax.swing.JLabel error;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JLabel show;
	private javax.swing.JPasswordField txtpassword;
	private javax.swing.JTextField txtusername;
	private javax.swing.JLabel underPass;
	private javax.swing.JLabel underUser;
	// End of variables declaration//GEN-END:variables
}
