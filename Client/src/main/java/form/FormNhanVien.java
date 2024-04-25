package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.NhanVienDao;
import entity.NhanVien;
import entity.TaiKhoan;
import jakarta.persistence.EntityManagerFactory;

public class FormNhanVien extends javax.swing.JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private EntityManagerFactory emf;
	private NhanVienDao nhanVienDao;
	private MainForm mainForm;

	public FormNhanVien(EntityManagerFactory emf, MainForm mainForm) {
		this.emf = emf;
		this.mainForm = mainForm;
		initComponents();
		formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
		formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Thông tin nhân viên", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
				}, Color.WHITE));
		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
		table.getTableHeader().setPreferredSize(new Dimension(30, 30));
		((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

		nhanVienDao = new NhanVienDao(emf);
		List<NhanVien> list = nhanVienDao.getAllNhanVien();
		addDataTable(list);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		groupRadio = new javax.swing.ButtonGroup();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		formThongTin = new form.Form();
		lbMaNV = new javax.swing.JLabel();
		jtMaNV = new javax.swing.JTextField();
		lbCCCD = new javax.swing.JLabel();
		jtCCCD = new javax.swing.JTextField();
		lbTen = new javax.swing.JLabel();
		jtTen = new javax.swing.JTextField();
		lbNgaySinh = new javax.swing.JLabel();
		jDate = new com.toedter.calendar.JDateChooser();
		lbGioiTinh = new javax.swing.JLabel();
		rdNam = new javax.swing.JRadioButton();
		rdNu = new javax.swing.JRadioButton();
		lbDiaChi = new javax.swing.JLabel();
		jtDiaChi = new javax.swing.JTextField();
		lbEmail = new javax.swing.JLabel();
		jtEmail = new javax.swing.JTextField();
		lbSdt = new javax.swing.JLabel();
		jtSDT = new javax.swing.JTextField();
		lbTrangThai = new javax.swing.JLabel();
		jcbTrangThai = new javax.swing.JComboBox<>();
		btnXoaTrang = new javax.swing.JButton();
		btnThem = new javax.swing.JButton();
		btnCapNhat = new javax.swing.JButton();
		btnTaoTaiKhoan = new javax.swing.JButton();
		btnExcel = new javax.swing.JButton();
		btnTim = new javax.swing.JButton();

		setOpaque(false);
		setPreferredSize(new java.awt.Dimension(1430, 968));

		table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null } },
				new String[] { "Mã nhân viên", "CCCD", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Email",
						"Số điện thoại", "Trạng thái" }));
		table.setGridColor(new java.awt.Color(255, 255, 255));
		table.setRowHeight(30);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tableMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(table);
		if (table.getColumnModel().getColumnCount() > 0) {
			table.getColumnModel().getColumn(0).setResizable(false);
			table.getColumnModel().getColumn(1).setResizable(false);
			table.getColumnModel().getColumn(2).setResizable(false);
			table.getColumnModel().getColumn(3).setResizable(false);
			table.getColumnModel().getColumn(4).setResizable(false);
			table.getColumnModel().getColumn(5).setResizable(false);
			table.getColumnModel().getColumn(6).setResizable(false);
			table.getColumnModel().getColumn(7).setResizable(false);
			table.getColumnModel().getColumn(8).setResizable(false);
		}

		lbMaNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbMaNV.setForeground(new java.awt.Color(255, 255, 255));
		lbMaNV.setText("Mã nhân viên");

		jtMaNV.setEditable(false);
		jtMaNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtMaNV.setBorder(null);
		jtMaNV.setPreferredSize(new java.awt.Dimension(300, 40));

		lbCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbCCCD.setForeground(new java.awt.Color(255, 255, 255));
		lbCCCD.setText("CCCD");

		jtCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtCCCD.setBorder(null);
		jtCCCD.setPreferredSize(new java.awt.Dimension(64, 40));

		lbTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbTen.setForeground(new java.awt.Color(255, 255, 255));
		lbTen.setText("Họ tên");

		jtTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtTen.setBorder(null);
		jtTen.setMinimumSize(new java.awt.Dimension(64, 30));
		jtTen.setPreferredSize(new java.awt.Dimension(64, 40));

		lbNgaySinh.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
		lbNgaySinh.setText("Ngày sinh");

		jDate.setAlignmentX(0.0F);
		jDate.setAlignmentY(0.0F);
		jDate.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jDate.setPreferredSize(new java.awt.Dimension(88, 40));

		lbGioiTinh.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
		lbGioiTinh.setText("Giới tính");

		groupRadio.add(rdNam);
		rdNam.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		rdNam.setForeground(new java.awt.Color(255, 255, 255));
		rdNam.setText("Nam");
		rdNam.setAlignmentY(0.0F);
		rdNam.setBorder(null);
		rdNam.setContentAreaFilled(false);
		rdNam.setFocusPainted(false);

		groupRadio.add(rdNu);
		rdNu.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		rdNu.setForeground(new java.awt.Color(255, 255, 255));
		rdNu.setText("Nữ");
		rdNu.setAlignmentY(0.0F);
		rdNu.setBorder(null);
		rdNu.setContentAreaFilled(false);
		rdNu.setFocusPainted(false);

		lbDiaChi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbDiaChi.setForeground(new java.awt.Color(255, 255, 255));
		lbDiaChi.setText("Địa chỉ");

		jtDiaChi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtDiaChi.setBorder(null);
		jtDiaChi.setPreferredSize(new java.awt.Dimension(64, 40));

		lbEmail.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbEmail.setForeground(new java.awt.Color(255, 255, 255));
		lbEmail.setText("Email");

		jtEmail.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtEmail.setBorder(null);
		jtEmail.setPreferredSize(new java.awt.Dimension(64, 40));

		lbSdt.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbSdt.setForeground(new java.awt.Color(255, 255, 255));
		lbSdt.setText("Số điện thoại");

		jtSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jtSDT.setBorder(null);
		jtSDT.setPreferredSize(new java.awt.Dimension(64, 40));

		lbTrangThai.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		lbTrangThai.setForeground(new java.awt.Color(255, 255, 255));
		lbTrangThai.setText("Trạng Thái");

		jcbTrangThai.setEditable(true);
		jcbTrangThai.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
		jcbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm", "Nghỉ làm" }));
		jcbTrangThai.setBorder(null);
		jcbTrangThai.setMinimumSize(new java.awt.Dimension(75, 40));
		jcbTrangThai.setPreferredSize(new java.awt.Dimension(95, 40));

		javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
		formThongTin.setLayout(formThongTinLayout);
		formThongTinLayout.setHorizontalGroup(formThongTinLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(formThongTinLayout.createSequentialGroup().addGap(31, 31, 31).addGroup(formThongTinLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(formThongTinLayout
								.createSequentialGroup().addGroup(formThongTinLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lbCCCD).addComponent(lbMaNV).addComponent(lbTen)
										.addComponent(lbNgaySinh).addComponent(lbGioiTinh))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(formThongTinLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(formThongTinLayout.createSequentialGroup()
												.addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(19, 19, 19))
										.addComponent(jtTen, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jtCCCD, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jtEmail, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(formThongTinLayout.createSequentialGroup()
												.addComponent(jtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 225,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, Short.MAX_VALUE))))
						.addGroup(formThongTinLayout.createSequentialGroup().addGroup(formThongTinLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbSdt)
								.addComponent(lbTrangThai).addComponent(lbEmail).addComponent(lbDiaChi))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(formThongTinLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jtSDT, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jcbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))))
						.addGap(23, 23, 23)));
		formThongTinLayout.setVerticalGroup(formThongTinLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(formThongTinLayout.createSequentialGroup().addGap(11, 11, 11)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbMaNV).addComponent(jtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbCCCD).addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbTen))
						.addGap(20, 20, 20)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(formThongTinLayout.createSequentialGroup()
										.addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										formThongTinLayout.createSequentialGroup().addComponent(lbNgaySinh).addGap(29,
												29, 29)))
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbGioiTinh).addComponent(rdNam).addComponent(rdNu))
						.addGap(20, 20, 20)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lbDiaChi))
						.addGap(20, 20, 20)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbEmail).addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbSdt).addComponent(jtSDT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbTrangThai).addComponent(jcbTrangThai,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(54, 54, 54)));

		btnXoaTrang.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnXoaTrang.setText("Xóa Trắng");
		btnXoaTrang.setBorder(null);
		btnXoaTrang.setBorderPainted(false);
		btnXoaTrang.setFocusPainted(false);
		btnXoaTrang.setPreferredSize(new java.awt.Dimension(103, 55));
		btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoaTrangActionPerformed(evt);
			}
		});

		btnThem.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnThem.setText("Thêm");
		btnThem.setBorder(null);
		btnThem.setBorderPainted(false);
		btnThem.setFocusPainted(false);
		btnThem.setPreferredSize(new java.awt.Dimension(105, 55));
		btnThem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThemActionPerformed(evt);
			}
		});

		btnCapNhat.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnCapNhat.setText("Cập nhật");
		btnCapNhat.setBorder(null);
		btnCapNhat.setBorderPainted(false);
		btnCapNhat.setFocusable(false);
		btnCapNhat.setPreferredSize(new java.awt.Dimension(100, 55));
		btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCapNhatActionPerformed(evt);
			}
		});

		btnTaoTaiKhoan.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTaoTaiKhoan.setText("Tạo tài khoản");
		btnTaoTaiKhoan.setBorder(null);
		btnTaoTaiKhoan.setBorderPainted(false);
		btnTaoTaiKhoan.setFocusPainted(false);
		btnTaoTaiKhoan.setFocusable(false);
		btnTaoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTaoTaiKhoanActionPerformed(evt);
			}
		});

		btnExcel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnExcel.setText("Xuất Excel");
		btnExcel.setBorder(null);
		btnExcel.setBorderPainted(false);
		btnExcel.setFocusPainted(false);
		btnExcel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExcelActionPerformed(evt);
			}
		});

		btnTim.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
		btnTim.setText("Tìm");
		btnTim.setBorder(null);
		btnTim.setBorderPainted(false);
		btnTim.setFocusPainted(false);
		btnTim.setPreferredSize(new java.awt.Dimension(105, 55));
		btnTim.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTimActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(formThongTin, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 113,
														Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 169,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(btnTaoTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(21, 21, 21)))));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1)
						.addGroup(layout.createSequentialGroup()
								.addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(109, 109, 109)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnTaoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 114, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void tableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableMouseClicked
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int index = table.getSelectedRow();
		if (index < 0)
			return;

		jtMaNV.setText(model.getValueAt(index, 0).toString());
		jtCCCD.setText(model.getValueAt(index, 1).toString());
		jtTen.setText(model.getValueAt(index, 2).toString());
		try {
			jDate.setDate(format.parse(model.getValueAt(index, 3).toString()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (model.getValueAt(index, 4).toString().equalsIgnoreCase("Nam")) {
			rdNam.setSelected(true);
		} else {
			rdNu.setSelected(true);
		}
		jtDiaChi.setText(model.getValueAt(index, 5).toString());
		jtEmail.setText(model.getValueAt(index, 6).toString());
		jtSDT.setText(model.getValueAt(index, 7).toString());
		jcbTrangThai.setSelectedItem(model.getValueAt(index, 8));

	}// GEN-LAST:event_tableMouseClicked

	private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcelActionPerformed
		// Mở dialog cho phép người dùng chọn đường dẫn
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xls", "xlsx");
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showSaveDialog(null);

        // Xử lý kết quả trả về từ dialog
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn được chọn
            String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Gọi hàm writeToExcel với đường dẫn đã chọn
            nhanVienDao.writeToExcel(selectedFilePath+".xls");
            JOptionPane.showMessageDialog(btnExcel, "Lưu thành công", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
            System.out.println("File Excel đã được lưu thành công.");
        } else if (returnValue == JFileChooser.CANCEL_OPTION) {
            System.out.println("Người dùng đã hủy lựa chọn.");
        }
	}// GEN-LAST:event_btnExcelActionPerformed

//	Tìm Nhân viên bằng CCCD hoặc số điện thoại
	private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimActionPerformed
		String tieuChi = "";
		if (!jtCCCD.getText().trim().equalsIgnoreCase("")) {
			tieuChi = jtCCCD.getText();
			List<NhanVien> list = new ArrayList<NhanVien>();
			NhanVien nhanVien = nhanVienDao.getNhanVienByCCCD(tieuChi);
			list.add(nhanVien);
			addDataTable(list);
		}
		if (!jtSDT.getText().trim().equalsIgnoreCase("")) {
			tieuChi = jtSDT.getText();
			List<NhanVien> list = new ArrayList<NhanVien>();
			NhanVien nhanVien = nhanVienDao.getNhanVienBySDT(tieuChi);
			list.add(nhanVien);
			addDataTable(list);
		} else {
			JOptionPane.showMessageDialog(btnTim, "Chưa nhập tiêu chí tìm kiếm(CCCD,SĐT)", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}// GEN-LAST:event_btnTimActionPerformed

//	Thêm nhân viên
	private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
		String CCCD = jtCCCD.getText();
		String ten = jtTen.getText();
		if (jDate.getDate() == null) {
			JOptionPane.showMessageDialog(btnCapNhat, "Chưa nhập ngày sinh", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		LocalDate ngaySinh = jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		if (groupRadio.getSelection() == null) {
			JOptionPane.showMessageDialog(btnCapNhat, "Chưa chọn giới tính", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		boolean gioiTinh = rdNam.isSelected();
		String diaChi = jtDiaChi.getText();
		String email = jtEmail.getText();
		String sdt = jtSDT.getText();
		boolean trangThai = true;
		NhanVien nhanVien = new NhanVien(CCCD, ten, CCCD, sdt, email, gioiTinh, diaChi, "User", trangThai, ngaySinh,
				LocalDate.now());
		int check = checkData(nhanVien);
		if (check > 0) {
			showMessageValue(check);
			return;
		} else {
			NhanVien nhanVienCccd = nhanVienDao.getNhanVienByCCCD(nhanVien.getCccd());
			if (nhanVienCccd != null) {
				JOptionPane.showMessageDialog(btnCapNhat, "Căn cước đã tồn tại", "Thông báo",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}

			List<NhanVien> listMNV = nhanVienDao.getAllNhanVienByMa(
					"" + nhanVien.getNgayVaoLam().getYear() % 100 + "" + nhanVien.getNgaySinh().getYear() % 100);
			String maTemp = "NV" + nhanVien.getNgayVaoLam().getYear() % 100 + ""
					+ nhanVien.getNgayVaoLam().getYear() % 100;
			String index = (listMNV.size() / 1000 > 0) ? ""+listMNV.size()+1 : (listMNV.size() / 100 > 0) ? ("0" + listMNV.size()+1)
					: (listMNV.size() / 10 > 0) ? "00" + listMNV.size()+1 : "000" + listMNV.size()+1;
			nhanVien.setMaNhanVien(maTemp + index);
			nhanVienDao.addNhanVien(nhanVien);
			addNhanVienTable(nhanVien);
			xoaTrang();
		}
	}// GEN-LAST:event_btnThemActionPerformed

//	Cập nhật nhân viên
	private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCapNhatActionPerformed
		String CCCD = jtCCCD.getText();
		String ten = jtTen.getText();
		if (jDate.getDate() == null) {
			JOptionPane.showMessageDialog(btnCapNhat, "Chưa nhập ngày sinh", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		LocalDate ngaySinh = jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		if (groupRadio.getSelection() == null) {
			JOptionPane.showMessageDialog(btnCapNhat, "Chưa chọn giới tính", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		boolean gioiTinh = rdNam.isSelected();
		String diaChi = jtDiaChi.getText();
		String email = jtEmail.getText();
		String sdt = jtSDT.getText();
		boolean trangThai = jcbTrangThai.getSelectedItem().equals("Đang làm");
		NhanVien nhanVien = new NhanVien(CCCD, ten, CCCD, sdt, email, gioiTinh, diaChi, "User", trangThai, ngaySinh,
				LocalDate.now());
		int check = checkData(nhanVien);
		if (check > 0) {
			showMessageValue(check);
		} else {
			nhanVien.setMaNhanVien(jtMaNV.getText());
			nhanVienDao.updateNhanVien(nhanVien);
			updateNhanVienTable(nhanVien);
			xoaTrang();
		}
	}// GEN-LAST:event_btnCapNhatActionPerformed

//show messager
	private void showMessageValue(int check) {
		switch (check) {
		case 1:
			JOptionPane.showMessageDialog(btnThem, "CCCD là 12 ký số", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(btnThem, "Họ tên không chứa số và ký tự đặc biệt", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			JOptionPane.showMessageDialog(btnThem, "Tuổi chưa đủ 18", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			JOptionPane.showMessageDialog(btnThem, "Địa chỉ không chứa ký tự đặc biệt", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			JOptionPane.showMessageDialog(btnThem, "Email không đúng(example@gmail.com)", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			JOptionPane.showMessageDialog(btnThem, "Số điện thoại không chính xác", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

//	Check dữ liệu
	private int checkData(NhanVien nhanVien) {
		if (!nhanVien.getCccd().trim().matches("\\d{12}")) {
			return 1;
		}
		if (!nhanVien.getHoTen().trim().matches("^[^!@#$%^&*()\\d]+$")) {
			return 2;
		}
		if (Period.between(nhanVien.getNgaySinh(), LocalDate.now()).getYears() <= 18) {
			return 3;
		}
		if (!nhanVien.getDiaChi().trim().matches("^[^!@#$%^&*()]+$")) {
			return 4;
		}
		if (!nhanVien.getEmail().trim().matches("^[a-zA-Z0-9._%+-]+@(gmail|email)\\.com$")) {
			return 5;
		}
		if (!nhanVien.getSdt().trim().matches("^0\\d{9,10}$")) {
			return 6;
		}
		return 0;
	}

	private void xoaTrang() {
		jtMaNV.setText("");
		jtCCCD.setText("");
		jtTen.setText("");
		jtDiaChi.setText("");
		jtEmail.setText("");
		jtSDT.setText("");
		jDate.setDate(null);
		groupRadio.clearSelection();
		jcbTrangThai.setSelectedIndex(0);
	}

	private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaTrangActionPerformed
		xoaTrang();

	}// GEN-LAST:event_btnXoaTrangActionPerformed

	private void btnTaoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTaoTaiKhoanActionPerformed
		int index = table.getSelectedRow();
		if (index < 0)
			JOptionPane.showMessageDialog(btnTaoTaiKhoan, "Chưa chọn nhân viên cần tạo tài khoản", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		NhanVien nhanVien = nhanVienDao.getNhanVienByMa(jtMaNV.getText());
		if (nhanVien.getTaiKhoan() != null) {
			JOptionPane.showMessageDialog(btnTaoTaiKhoan, "Nhân viên đã tạo tài khoản", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		mainForm.showForm(new FormTaiKhoan(emf, nhanVien));

	}// GEN-LAST:event_btnTaoTaiKhoanActionPerformed

	private void addNhanVienTable(NhanVien nhanVien) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] { nhanVien.getMaNhanVien(), nhanVien.getCccd(), nhanVien.getHoTen(),
				nhanVien.getNgaySinh().toString(), nhanVien.isGioiTinh() ? "Nam" : "Nữ", nhanVien.getDiaChi(),
				nhanVien.getEmail(), nhanVien.getSdt(), nhanVien.getTrangThai() ? "Đang làm" : "Nghỉ làm" });
	}

	private void updateNhanVienTable(NhanVien nhanVien) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < table.getRowCount(); i++) {
			String cellValue = table.getValueAt(i, 0).toString();
			if (nhanVien.getMaNhanVien().equalsIgnoreCase(cellValue)) {
				model.setValueAt(nhanVien.getCccd(), i, 1);
				model.setValueAt(nhanVien.getHoTen(), i, 2);
				model.setValueAt(nhanVien.getNgaySinh().toString(), i, 3);
				model.setValueAt(nhanVien.isGioiTinh() ? "Nam" : "Nữ", i, 4);
				model.setValueAt(nhanVien.getDiaChi(), i, 5);
				model.setValueAt(nhanVien.getEmail(), i, 6);
				model.setValueAt(nhanVien.getSdt(), i, 7);
				model.setValueAt(nhanVien.getTrangThai() ? "Đang làm" : "Nghỉ làm", i, 8);
			}
		}
	}

	private void addDataTable(List<NhanVien> list) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for (NhanVien nhanVien : list) {
			Object[] row = { nhanVien.getMaNhanVien(), nhanVien.getCccd(), nhanVien.getHoTen(),
					nhanVien.getNgaySinh().toString(), nhanVien.isGioiTinh() ? "Nam" : "Nữ", nhanVien.getDiaChi(),
					nhanVien.getEmail(), nhanVien.getSdt(), nhanVien.getTrangThai() ? "Đang làm" : "Nghỉ làm" };

			model.addRow(row);
		}
		model.fireTableDataChanged();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCapNhat;
	private javax.swing.JButton btnExcel;
	private javax.swing.JButton btnTaoTaiKhoan;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnTim;
	private javax.swing.JButton btnXoaTrang;
	private form.Form formThongTin;
	private javax.swing.ButtonGroup groupRadio;
	private com.toedter.calendar.JDateChooser jDate;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JComboBox<String> jcbTrangThai;
	private javax.swing.JTextField jtCCCD;
	private javax.swing.JTextField jtDiaChi;
	private javax.swing.JTextField jtEmail;
	private javax.swing.JTextField jtMaNV;
	private javax.swing.JTextField jtSDT;
	private javax.swing.JTextField jtTen;
	private javax.swing.JLabel lbCCCD;
	private javax.swing.JLabel lbDiaChi;
	private javax.swing.JLabel lbEmail;
	private javax.swing.JLabel lbGioiTinh;
	private javax.swing.JLabel lbMaNV;
	private javax.swing.JLabel lbNgaySinh;
	private javax.swing.JLabel lbSdt;
	private javax.swing.JLabel lbTen;
	private javax.swing.JLabel lbTrangThai;
	private javax.swing.JRadioButton rdNam;
	private javax.swing.JRadioButton rdNu;
	private javax.swing.JTable table;
	// End of variables declaration//GEN-END:variables

}
