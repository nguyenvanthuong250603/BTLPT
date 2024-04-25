package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.GaDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.VeDao;
import entity.ChiTietVe;
import entity.Ga;
import entity.HoaDon;
import entity.KhachHang;
import entity.KhuyenMai;
import entity.Ve;
import jakarta.persistence.EntityManagerFactory;

public class GD_DoiTra extends javax.swing.JPanel {
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private EntityManagerFactory emf;
	private VeDao veDao;
	private GaDao gaDao;;

	public GD_DoiTra(EntityManagerFactory emf) {
		initComponents();
		formHoaDon.setBorder(new EmptyBorder(0, 0, 0, 0));
		formHoaDon.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Bảng hóa đơn", 0, 0, new Font(Font.SANS_SERIF, Font.PLAIN, 14) {
				}, Color.WHITE));

		formVe.setBorder(new EmptyBorder(0, 0, 0, 0));
		formVe.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Bảng vé", 0, 0,
				new Font(Font.SANS_SERIF, Font.PLAIN, 14) {
				}, Color.WHITE));

		form1.setBorder(new EmptyBorder(0, 0, 0, 0));
		form1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Thông tin hóa đơn", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.PLAIN, 16) {
				}, Color.WHITE));
		form2.setBorder(new EmptyBorder(0, 0, 0, 0));
		form2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin vé", 0,
				HEIGHT, new Font(Font.SANS_SERIF, Font.PLAIN, 16) {
				}, Color.WHITE));

		this.emf = emf;
		veDao = new VeDao(emf);
		tableHD.setShowGrid(false);
		tableHD.setShowHorizontalLines(false);
		tableHD.setShowVerticalLines(false);
		tableHD.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
		tableHD.getTableHeader().setPreferredSize(new Dimension(30, 30));
		((DefaultTableCellRenderer) tableHD.getTableHeader().getDefaultRenderer())
				.setHorizontalAlignment(JLabel.CENTER);

		tableVe.setShowGrid(false);
		tableVe.setShowHorizontalLines(false);
		tableVe.setShowVerticalLines(false);
		tableVe.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
		tableVe.getTableHeader().setPreferredSize(new Dimension(30, 30));
		((DefaultTableCellRenderer) tableVe.getTableHeader().getDefaultRenderer())
				.setHorizontalAlignment(JLabel.CENTER);

		renderHoaDon();

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		formHoaDon = new form.Form();
		jScrollPane1 = new javax.swing.JScrollPane();
		tableHD = new javax.swing.JTable();
		formVe = new form.Form();
		jScrollPane2 = new javax.swing.JScrollPane();
		tableVe = new javax.swing.JTable();
		form1 = new form.Form();
		lbMHD = new javax.swing.JLabel();
		jtMHD = new javax.swing.JTextField();
		lbMNV = new javax.swing.JLabel();
		jtMNV = new javax.swing.JTextField();
		lbCCCCHD = new javax.swing.JLabel();
		jtCCCDHD = new javax.swing.JTextField();
		lbTenHKHD = new javax.swing.JLabel();
		jtTenKHHD = new javax.swing.JTextField();
		lbSDT = new javax.swing.JLabel();
		jtSDT = new javax.swing.JTextField();
		lbTongT = new javax.swing.JLabel();
		jtTongT = new javax.swing.JTextField();
		form2 = new form.Form();
		lbMV = new javax.swing.JLabel();
		jtMV = new javax.swing.JTextField();
		lbCCCDV = new javax.swing.JLabel();
		jtCCCDV = new javax.swing.JTextField();
		lbLoaiCho = new javax.swing.JLabel();
		jcbLoaiCho = new javax.swing.JComboBox<>();
		lbVTToa = new javax.swing.JLabel();
		jcbSoToa = new javax.swing.JComboBox<>();
		lbViTriNgoi = new javax.swing.JLabel();
		jcbViTri = new javax.swing.JComboBox<>();
		lbVIGiuong = new javax.swing.JLabel();
		jcbVTGiuong = new javax.swing.JComboBox<>();
		lbGia = new javax.swing.JLabel();
		jtGia = new javax.swing.JTextField();
		btnXoaT = new javax.swing.JButton();
		btnTimHD = new javax.swing.JButton();
		btnTimV = new javax.swing.JButton();
		btnDoi = new javax.swing.JButton();
		btnTra = new javax.swing.JButton();

		setPreferredSize(new java.awt.Dimension(1600, 950));

		tableHD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		tableHD.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null } },
				new String[] { "Mã hóa đơn", "Mã nhân viên", "CCCD", "Tên khách hàng", "Số điện thoại", "Khuyến mãi",
						"Ngày lập hóa đơn", "Giời lập Hóa đơn", "Tổng tiền" }));
		tableHD.setAlignmentX(0.0F);
		tableHD.setAlignmentY(0.0F);
		tableHD.setGridColor(new java.awt.Color(255, 255, 255));
		tableHD.setRowHeight(30);
		jScrollPane1.setViewportView(tableHD);
		tableHD.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				String maHD = tableHD.getValueAt(tableHD.getSelectedRow(), 0).toString();

				HoaDon hd = hoaDonDao.getHoaDonByMa(maHD);
				hienHoaDon(hd);
				hienBangVe(maHD, "");
				if (tableVe.getRowCount() > 0)
					tableVe.setRowSelectionInterval(0, 0);
				tableVe.clearSelection();
			}
		});
		javax.swing.GroupLayout formHoaDonLayout = new javax.swing.GroupLayout(formHoaDon);
		formHoaDon.setLayout(formHoaDonLayout);
		formHoaDonLayout
				.setHorizontalGroup(formHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE));
		formHoaDonLayout
				.setVerticalGroup(formHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE));

		tableVe.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		tableVe.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "Mã vé", "CCCD", "Tên khách hàng", "Đối tượng", "Ga đi", "Ga đến", "Mã tàu", "Số toa",
						"Vị trí Chổ", "Giờ lên tàu", "Giá" }));
		tableVe.setAlignmentX(0.0F);
		tableVe.setAlignmentY(0.0F);
		tableVe.setGridColor(new java.awt.Color(255, 255, 255));
		tableVe.setRowHeight(30);
		jScrollPane2.setViewportView(tableVe);
		if (tableVe.getColumnModel().getColumnCount() > 0) {
			tableVe.getColumnModel().getColumn(0).setResizable(false);
			tableVe.getColumnModel().getColumn(1).setResizable(false);
			tableVe.getColumnModel().getColumn(2).setResizable(false);
			tableVe.getColumnModel().getColumn(3).setResizable(false);
			tableVe.getColumnModel().getColumn(4).setResizable(false);
			tableVe.getColumnModel().getColumn(5).setResizable(false);
			tableVe.getColumnModel().getColumn(6).setResizable(false);
			tableVe.getColumnModel().getColumn(7).setResizable(false);
			tableVe.getColumnModel().getColumn(8).setResizable(false);
			tableVe.getColumnModel().getColumn(9).setResizable(false);
			tableVe.getColumnModel().getColumn(10).setResizable(false);
		}
		tableVe.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				String maVe = tableVe.getValueAt(tableVe.getSelectedRow(), 0).toString();
				Ve ve = veDao.getVeByMa(maVe);
				hienChiTietVe(ve);
			}
		});
		javax.swing.GroupLayout formVeLayout = new javax.swing.GroupLayout(formVe);
		formVe.setLayout(formVeLayout);
		formVeLayout.setHorizontalGroup(
				formVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2));
		formVeLayout.setVerticalGroup(formVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(formVeLayout.createSequentialGroup().addComponent(jScrollPane2,
						javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		lbMHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbMHD.setForeground(new java.awt.Color(255, 255, 255));
		lbMHD.setText("Mã hóa đơn");

		jtMHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtMHD.setToolTipText("");
		jtMHD.setAlignmentX(1.0F);
		jtMHD.setAlignmentY(1.0F);
		jtMHD.setBorder(null);
		jtMHD.setMargin(new java.awt.Insets(2, 50, 2, 6));
		jtMHD.setPreferredSize(new java.awt.Dimension(310, 40));

		lbMNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbMNV.setForeground(new java.awt.Color(255, 255, 255));
		lbMNV.setText("Mã nhân viên");

		jtMNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtMNV.setToolTipText("");
		jtMNV.setBorder(null);
		jtMNV.setPreferredSize(new java.awt.Dimension(64, 40));

		lbCCCCHD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbCCCCHD.setForeground(new java.awt.Color(255, 255, 255));
		lbCCCCHD.setText("CCCD");

		jtCCCDHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtCCCDHD.setToolTipText("");
		jtCCCDHD.setBorder(null);
		jtCCCDHD.setPreferredSize(new java.awt.Dimension(64, 40));

		lbTenHKHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbTenHKHD.setForeground(new java.awt.Color(255, 255, 255));
		lbTenHKHD.setText("Tên khách hàng");

		jtTenKHHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtTenKHHD.setToolTipText("");
		jtTenKHHD.setBorder(null);
		jtTenKHHD.setPreferredSize(new java.awt.Dimension(64, 40));

		lbSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbSDT.setForeground(new java.awt.Color(255, 255, 255));
		lbSDT.setText("Số điện thoại");

		jtSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtSDT.setToolTipText("");
		jtSDT.setBorder(null);
		jtSDT.setPreferredSize(new java.awt.Dimension(64, 40));

		lbTongT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbTongT.setForeground(new java.awt.Color(255, 255, 255));
		lbTongT.setText("Số điện thoại");

		jtTongT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtTongT.setToolTipText("");
		jtTongT.setBorder(null);
		jtTongT.setPreferredSize(new java.awt.Dimension(64, 40));

		javax.swing.GroupLayout form1Layout = new javax.swing.GroupLayout(form1);
		form1.setLayout(form1Layout);
		form1Layout.setHorizontalGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form1Layout.createSequentialGroup().addGroup(form1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(form1Layout.createSequentialGroup().addGap(40, 40, 40)
								.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lbMNV).addComponent(lbCCCCHD).addComponent(lbMHD)
										.addComponent(lbSDT).addComponent(lbTongT))
								.addGap(23, 23, 23))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								form1Layout.createSequentialGroup().addContainerGap().addComponent(lbTenHKHD)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtTenKHHD, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtMHD, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtCCCDHD, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtMNV, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jtTongT, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		form1Layout.setVerticalGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form1Layout.createSequentialGroup().addGap(8, 8, 8)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbMHD).addComponent(jtMHD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtMNV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMNV))
						.addGap(19, 19, 19)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtCCCDHD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbCCCCHD))
						.addGap(20, 20, 20)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtTenKHHD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbTenHKHD))
						.addGap(18, 18, 18)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtSDT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbSDT))
						.addGap(18, 18, 18)
						.addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbTongT).addComponent(jtTongT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(28, Short.MAX_VALUE)));

		lbMV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbMV.setForeground(new java.awt.Color(255, 255, 255));
		lbMV.setText("Mã vé");

		jtMV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtMV.setToolTipText("");
		jtMV.setBorder(null);
		jtMV.setPreferredSize(new java.awt.Dimension(64, 40));

		lbCCCDV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbCCCDV.setForeground(new java.awt.Color(255, 255, 255));
		lbCCCDV.setText("CCCD");

		jtCCCDV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtCCCDV.setToolTipText("");
		jtCCCDV.setBorder(null);
		jtCCCDV.setPreferredSize(new java.awt.Dimension(64, 40));

		lbLoaiCho.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbLoaiCho.setForeground(new java.awt.Color(255, 255, 255));
		lbLoaiCho.setText("Loại chổ");

		jcbLoaiCho.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jcbLoaiCho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
		jcbLoaiCho.setBorder(null);
		jcbLoaiCho.setPreferredSize(new java.awt.Dimension(72, 40));

		lbVTToa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbVTToa.setForeground(new java.awt.Color(255, 255, 255));
		lbVTToa.setText("Số toa");

		jcbSoToa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jcbSoToa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
		jcbSoToa.setBorder(null);
		jcbSoToa.setPreferredSize(new java.awt.Dimension(72, 40));
		jcbSoToa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jcbSoToaActionPerformed(evt);
			}
		});

		lbViTriNgoi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbViTriNgoi.setForeground(new java.awt.Color(255, 255, 255));
		lbViTriNgoi.setText("Vị trí");

		jcbViTri.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jcbViTri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
		jcbViTri.setBorder(null);
		jcbViTri.setPreferredSize(new java.awt.Dimension(72, 40));

		lbVIGiuong.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbVIGiuong.setForeground(new java.awt.Color(255, 255, 255));
		lbVIGiuong.setText("Vị trí giường");

		jcbVTGiuong.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		jcbVTGiuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
		jcbVTGiuong.setBorder(null);
		jcbVTGiuong.setPreferredSize(new java.awt.Dimension(72, 40));

		lbGia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		lbGia.setForeground(new java.awt.Color(255, 255, 255));
		lbGia.setText("Giá");

		jtGia.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtGia.setToolTipText("");
		jtGia.setBorder(null);
		jtGia.setPreferredSize(new java.awt.Dimension(64, 40));

		javax.swing.GroupLayout form2Layout = new javax.swing.GroupLayout(form2);
		form2.setLayout(form2Layout);
		form2Layout.setHorizontalGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form2Layout.createSequentialGroup().addGap(40, 40, 40)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lbViTriNgoi).addComponent(lbVIGiuong).addComponent(lbVTToa)
										.addComponent(lbGia).addComponent(lbLoaiCho).addComponent(lbCCCDV))
								.addGroup(form2Layout.createSequentialGroup().addComponent(lbMV).addGap(46, 46, 46)))
						.addGap(26, 26, 26).addGroup(
								form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(form2Layout.createSequentialGroup().addGroup(form2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jcbVTGiuong, javax.swing.GroupLayout.Alignment.TRAILING,
														0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jcbViTri, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(jcbSoToa, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(jtGia, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jtCCCDV, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jcbLoaiCho, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
												.addGap(35, 35, 35))
										.addGroup(form2Layout.createSequentialGroup()
												.addComponent(jtMV, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)))));
		form2Layout.setVerticalGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(form2Layout.createSequentialGroup().addGap(8, 8, 8)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtMV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMV))
						.addGap(16, 16, 16)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbCCCDV).addComponent(jtCCCDV, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(12, 12, 12)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbLoaiCho)
								.addComponent(jcbLoaiCho, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(12, 12, 12)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbVTToa).addComponent(jcbSoToa, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(12, 12, 12)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbViTriNgoi)
								.addComponent(jcbViTri, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(16, 16, 16)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbVIGiuong)
								.addComponent(jcbVTGiuong, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbGia).addComponent(jtGia, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(28, Short.MAX_VALUE)));

		btnXoaT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnXoaT.setText("Xóa trắng");
		btnXoaT.setBorder(null);
		btnXoaT.setBorderPainted(false);
		btnXoaT.setMaximumSize(new java.awt.Dimension(75, 60));
		btnXoaT.setPreferredSize(new java.awt.Dimension(75, 50));
		btnXoaT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoaTActionPerformed(evt);
			}
		});

		btnTimHD.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTimHD.setText("Tìm Hóa đơn");
		btnTimHD.setBorder(null);
		btnTimHD.setBorderPainted(false);
		btnTimHD.setMaximumSize(new java.awt.Dimension(75, 60));
		btnTimHD.setPreferredSize(new java.awt.Dimension(75, 50));
		btnTimHD.addActionListener(e -> {
			timHoaDon();
		});

		btnTimV.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTimV.setText("Tìm Vé");
		btnTimV.setBorder(null);
		btnTimV.setFocusPainted(false);
		btnTimV.setMaximumSize(new java.awt.Dimension(75, 60));
		btnTimV.setPreferredSize(new java.awt.Dimension(75, 50));
		btnTimV.addActionListener(e -> {
			timVe();
		});

		btnDoi.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnDoi.setText("Đổi vé");
		btnDoi.setBorder(null);
		btnDoi.setBorderPainted(false);
		btnDoi.setMaximumSize(new java.awt.Dimension(75, 60));
		btnDoi.setPreferredSize(new java.awt.Dimension(75, 50));
		btnDoi.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnDoiMouseClicked(evt);
			}
		});

		btnTra.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTra.setText("Trả vé");
		btnTra.setBorder(null);
		btnTra.setBorderPainted(false);
		btnTra.setMaximumSize(new java.awt.Dimension(75, 60));
		btnTra.setPreferredSize(new java.awt.Dimension(75, 50));
		btnTra.addActionListener(e -> {
			traVe();
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(formHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(formVe, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(form1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(form2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
								.addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 174,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTimV, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(18, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(formHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(formVe, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(form2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(8, 8, 8)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnTimHD, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTimV, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnDoi, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(54, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void jcbSoToaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jcbSoToaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jcbSoToaActionPerformed

	private void btnXoaTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaTActionPerformed
		jtMHD.setText("");
		jtMNV.setText("");
		jtCCCDHD.setText("");
		jtTenKHHD.setText("");
		jtSDT.setText("");
		jtMV.setText("");
		jtCCCDV.setText("");
		jtGia.setText("");
		renderHoaDon();
		DefaultTableModel model = (DefaultTableModel) tableVe.getModel();
		model.setRowCount(0);
		tableVe.setModel(model);

	}// GEN-LAST:event_btnXoaTActionPerformed

	private void btnTimHDMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnTimHDMouseClicked
		;
	}// GEN-LAST:event_btnTimHDMouseClicked

	private void btnTimVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnTimVMouseClicked
		// TODO add your handling code here:
	}// GEN-LAST:event_btnTimVMouseClicked

	private void btnDoiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnDoiMouseClicked
		// TODO add your handling code here:
	}// GEN-LAST:event_btnDoiMouseClicked

	private void btnTraMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnTraMouseClicked

	}// GEN-LAST:event_btnTraMouseClicked

	protected void paintChildren(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#085d81"), 0, getHeight(), Color.decode("#085d81"));
		g2.setPaint(g3);
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
		super.paintChildren(g);
	}

	private void renderHoaDon() {
		khachHangDao = new KhachHangDao(emf);
		hoaDonDao = new HoaDonDao(emf);
		List<HoaDon> lhd = hoaDonDao.getAllHoaDon();
		DefaultTableModel model = (DefaultTableModel) tableHD.getModel();
		model.setRowCount(0);

		for (HoaDon hoaDon : lhd) {
			KhachHang kh = khachHangDao.getKhachHangByCCCD(hoaDon.getKhachHang().getCccd());
			List<Ve> listVe = hoaDon.getListVes();
			double tongTien = 0;
			for (Ve ve : listVe) {
				Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
				Ga gaChieuDi = null;
				Ga gaChieuDen = null;
				for (ChiTietVe ctv : listChiTietVes) {
					if (ctv.isChieu())
						gaChieuDi = ctv.getGa();
					else
						gaChieuDen = ctv.getGa();
				}
				tongTien += ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
						* (ve.getKhuyenMai() == null ? 1 : ve.getKhuyenMai().getChietKhau());
			}
			Set<KhuyenMai> listKhuyenMai = hoaDon.getLisKhuyenMais();
			double km = 0;
			for (KhuyenMai khuyenMai : listKhuyenMai) {
				km += khuyenMai.getChietKhau();

			}
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNhanVien().getMaNhanVien(), kh.getCccd(), kh.getHoTen(),
					kh.getSdt(), km, hoaDon.getNgayTao(), hoaDon.getGioTao(), tongTien };
			model.addRow(row);
		}
		model.fireTableDataChanged();
	}

	private void hienHoaDon(HoaDon hd) {
		jtMHD.setText(hd.getMaHoaDon());
		jtMNV.setText(hd.getNhanVien().getMaNhanVien());
		KhachHang kh = khachHangDao.getKhachHangByCCCD(hd.getKhachHang().getCccd());
		jtCCCDHD.setText(kh.getCccd());
		jtTenKHHD.setText(kh.getHoTen());
		jtSDT.setText(kh.getSdt());
	}

	private void hienChiTietVe(Ve ve) {
		jtMV.setText(ve.getMaVe());
		jtCCCDV.setText(ve.getKhachHang().getCccd());
		Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
		Ga gaChieuDi = null;
		Ga gaChieuDen = null;
		for (ChiTietVe ctv : listChiTietVes) {
			if (ctv.isChieu())
				gaChieuDi = ctv.getGa();
			else
				gaChieuDen = ctv.getGa();
		}
		jtGia.setText(ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
				* (ve.getKhuyenMai() == null ? 1 : ve.getKhuyenMai().getChietKhau()) + "");

	}

	private void timHoaDon() {
		String maHD = jtMHD.getText();
		if (maHD.equals("")) {
			JOptionPane.showMessageDialog(null, "Chưa nhập mã hoá đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			HoaDon hoaDon = hoaDonDao.getHoaDonByMa(maHD);
			if (hoaDon != null) {
				DefaultTableModel model = (DefaultTableModel) tableHD.getModel();
				model.setRowCount(0);
				KhachHang kh = khachHangDao.getKhachHangByCCCD(hoaDon.getKhachHang().getCccd());
				List<Ve> listVe = hoaDon.getListVes();
				double tongTien = 0;
				for (Ve ve : listVe) {
					Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
					Ga gaChieuDi = null;
					Ga gaChieuDen = null;
					for (ChiTietVe ctv : listChiTietVes) {
						if (ctv.isChieu())
							gaChieuDi = ctv.getGa();
						else
							gaChieuDen = ctv.getGa();
					}
					tongTien += ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
							* (ve.getKhuyenMai() == null ? 1 : ve.getKhuyenMai().getChietKhau());
				}
				Set<KhuyenMai> listKhuyenMai = hoaDon.getLisKhuyenMais();
				double km = 0;
				for (KhuyenMai khuyenMai : listKhuyenMai) {
					km += khuyenMai.getChietKhau();

				}
				Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNhanVien().getMaNhanVien(), kh.getCccd(),
						kh.getHoTen(), kh.getSdt(), km, hoaDon.getNgayTao(), hoaDon.getGioTao(), tongTien };
				model.addRow(row);
				model.fireTableDataChanged();
				hienBangVe(maHD, "");
			} else {
				JOptionPane.showMessageDialog(null, "Mã hóa đơn nhập không có trong hệ thống", "Thông báo",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	private void hienBangVe(String maHD, String maVe) {
		List<Ve> listVe = !maHD.equals("") ? veDao.getListVeByMaHD(maHD) : veDao.getListVeByMaVe(maVe);
		DefaultTableModel model = (DefaultTableModel) tableVe.getModel();
		model.setRowCount(0);
		for (Ve ve : listVe) {
			KhachHang kh = khachHangDao.getKhachHangByCCCD(ve.getKhachHang().getCccd());
			Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
			Ga gaChieuDi = null;
			Ga gaChieuDen = null;
			for (ChiTietVe ctv : listChiTietVes) {
				if (ctv.isChieu())
					gaChieuDi = ctv.getGa();
				else
					gaChieuDen = ctv.getGa();
			}
			Object[] row = { ve.getMaVe(), kh.getCccd(), kh.getHoTen(), kh.getDoiTuong(), gaChieuDi.getTenGa(),
					gaChieuDen.getTenGa(), ve.getChuyen().getTau().getMaTau(), ve.getChoNgoi().getToa().getViTri(),
					ve.getChoNgoi().getViTri(), ve.getThoiGianLenTau(),

					ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())
							* (ve.getKhuyenMai() == null ? 1 : ve.getKhuyenMai().getChietKhau()) };
			model.addRow(row);
		}
		model.fireTableDataChanged();
	}

	private void timVe() {
		String maVe = jtMV.getText();
		if (maVe.equals("")) {
			JOptionPane.showMessageDialog(null, "Chưa nhập mã vé", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			jtMV.requestFocus();
		} else {
			Ve ve = veDao.getVeByMa(maVe);
			if (ve != null) {
				hienBangVe("", maVe);
				tableVe.setRowSelectionInterval(0, 0);
			} else {
				JOptionPane.showMessageDialog(null, "Mã vé nhập không có trong hệ thống", "Thông báo",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	private void traVe() {
		if (tableVe.getRowCount() > 0) {
			String maVe = tableVe.getValueAt(tableVe.getSelectedRow(), 0).toString();
			Ve ve = veDao.getVeByMa(maVe);
			LocalDateTime ngayDi = ve.getThoiGianLenTau();
			LocalDate timeDate = ngayDi.toLocalDate();

			long tinhTime = ChronoUnit.DAYS.between(LocalDate.now(), ngayDi);

			if (timeDate.isBefore(LocalDate.now())) {
				JOptionPane.showMessageDialog(null, "Chuyến tàu này đã khởi hành , đổi vé không có hiệu lực",
						"Thông báo", JOptionPane.INFORMATION_MESSAGE);
			} else {

				if (tinhTime > 1) {
					Set<ChiTietVe> listChiTietVes = ve.getLisChiTietVes();
					Ga gaChieuDi = null;
					Ga gaChieuDen = null;
					for (ChiTietVe ctv : listChiTietVes) {
						if (ctv.isChieu())
							gaChieuDi = ctv.getGa();
						else
							gaChieuDen = ctv.getGa();
					}
//					chi dc tra 70%
					double soTienDuocTra = ve.getChoNgoi().getGia() * Math.abs(gaChieuDen.getId() - gaChieuDi.getId())*0.7
							* (ve.getKhuyenMai() == null ? 1 : ve.getKhuyenMai().getChietKhau());
					veDao.updateDoiVe(maVe, LocalDateTime.now());

				} else {
					JOptionPane.showMessageDialog(null, "Vé không thể đổi trả do sắp đến giờ khởi hành", "Thông báo",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Bạn chưa nhập vé để đổi trả", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnDoi;
	private javax.swing.JButton btnTimHD;
	private javax.swing.JButton btnTimV;
	private javax.swing.JButton btnTra;
	private javax.swing.JButton btnXoaT;
	private form.Form form1;
	private form.Form form2;
	private form.Form formHoaDon;
	private form.Form formVe;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JComboBox<String> jcbLoaiCho;
	private javax.swing.JComboBox<String> jcbSoToa;
	private javax.swing.JComboBox<String> jcbVTGiuong;
	private javax.swing.JComboBox<String> jcbViTri;
	private javax.swing.JTextField jtCCCDHD;
	private javax.swing.JTextField jtCCCDV;
	private javax.swing.JTextField jtGia;
	private javax.swing.JTextField jtMHD;
	private javax.swing.JTextField jtMNV;
	private javax.swing.JTextField jtMV;
	private javax.swing.JTextField jtSDT;
	private javax.swing.JTextField jtTenKHHD;
	private javax.swing.JTextField jtTongT;
	private javax.swing.JLabel lbCCCCHD;
	private javax.swing.JLabel lbCCCDV;
	private javax.swing.JLabel lbGia;
	private javax.swing.JLabel lbLoaiCho;
	private javax.swing.JLabel lbMHD;
	private javax.swing.JLabel lbMNV;
	private javax.swing.JLabel lbMV;
	private javax.swing.JLabel lbSDT;
	private javax.swing.JLabel lbTenHKHD;
	private javax.swing.JLabel lbTongT;
	private javax.swing.JLabel lbVIGiuong;
	private javax.swing.JLabel lbVTToa;
	private javax.swing.JLabel lbViTriNgoi;
	private javax.swing.JTable tableHD;
	private javax.swing.JTable tableVe;
	// End of variables declaration//GEN-END:variables
}
