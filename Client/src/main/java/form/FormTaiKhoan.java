
package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.NhanVienDao;
import dao.TaiKhoanDao;
import entity.NhanVien;
import entity.TaiKhoan;
import jakarta.persistence.EntityManagerFactory;

public class FormTaiKhoan extends javax.swing.JPanel {
	private EntityManagerFactory emf;
	private TaiKhoanDao taiKhoanDao;
	private NhanVienDao nhanVienDao;
	private NhanVien nhanVien;

	public FormTaiKhoan(EntityManagerFactory emf, NhanVien nhanVien) {
		this.emf = emf;
		this.nhanVien = nhanVien;
		initComponents();
		fNhap.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Thông tin tài khoản", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
				}, Color.WHITE));
		fHienThi.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
				"Thông tin nhân viên", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
				}, Color.WHITE));
		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
		table.getTableHeader().setPreferredSize(new Dimension(30, 30));
		((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		taiKhoanDao = new TaiKhoanDao(emf);
		nhanVienDao = new NhanVienDao(emf);
		if (nhanVien != null) {
			jtMa.setText(nhanVien.getMaNhanVien());
			jtTen.setText(nhanVien.getHoTen());
			jtMa.setFocusable(false);
			jtTen.setFocusable(false);
			addDataArea(nhanVien);
		}
		addDatatable();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fNhap = new form.Form();
        lbMa1 = new javax.swing.JLabel();
        jtMa = new javax.swing.JTextField();
        lbTen1 = new javax.swing.JLabel();
        jtTen = new javax.swing.JTextField();
        lbTK = new javax.swing.JLabel();
        jbTK = new javax.swing.JTextField();
        lbMK = new javax.swing.JLabel();
        jtMK = new javax.swing.JTextField();
        fHienThi = new form.Form();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaNV = new javax.swing.JTextArea();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoaT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 950));

        fNhap.setPreferredSize(new java.awt.Dimension(380, 405));

        lbMa1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMa1.setForeground(new java.awt.Color(255, 255, 255));
        lbMa1.setText("Mã nhân viên");

        jtMa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMa.setBorder(null);
        jtMa.setPreferredSize(new java.awt.Dimension(300, 40));

        lbTen1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTen1.setForeground(new java.awt.Color(255, 255, 255));
        lbTen1.setText("Họ tên");

        jtTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtTen.setBorder(null);
        jtTen.setPreferredSize(new java.awt.Dimension(300, 40));

        lbTK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTK.setForeground(new java.awt.Color(255, 255, 255));
        lbTK.setText("Tên tài khoản");

        jbTK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jbTK.setBorder(null);
        jbTK.setPreferredSize(new java.awt.Dimension(300, 40));

        lbMK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMK.setForeground(new java.awt.Color(255, 255, 255));
        lbMK.setText("Mật Khẩu");

        jtMK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtMK.setBorder(null);
        jtMK.setPreferredSize(new java.awt.Dimension(300, 40));

        javax.swing.GroupLayout fNhapLayout = new javax.swing.GroupLayout(fNhap);
        fNhap.setLayout(fNhapLayout);
        fNhapLayout.setHorizontalGroup(
            fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fNhapLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fNhapLayout.createSequentialGroup()
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTK)
                            .addComponent(lbMK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtMK, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jbTK, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                    .addGroup(fNhapLayout.createSequentialGroup()
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMa1)
                            .addComponent(lbTen1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fNhapLayout.setVerticalGroup(
            fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fNhapLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa1)
                    .addComponent(jtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen1))
                .addGap(20, 20, 20)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTK)
                    .addComponent(jbTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(fNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMK)
                    .addComponent(jtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jtaNV.setEditable(false);
        jtaNV.setBackground(new java.awt.Color(102, 102, 255));
        jtaNV.setColumns(20);
        jtaNV.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jtaNV.setForeground(new java.awt.Color(255, 255, 255));
        jtaNV.setRows(9);
        jtaNV.setTabSize(14);
        jtaNV.setSelectionColor(new java.awt.Color(0, 51, 204));
        jScrollPane2.setViewportView(jtaNV);

        javax.swing.GroupLayout fHienThiLayout = new javax.swing.GroupLayout(fHienThi);
        fHienThi.setLayout(fHienThiLayout);
        fHienThiLayout.setHorizontalGroup(
            fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fHienThiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        fHienThiLayout.setVerticalGroup(
            fHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fHienThiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTim.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.setBorder(null);
        btnTim.setBorderPainted(false);
        btnTim.setPreferredSize(new java.awt.Dimension(82, 55));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        btnThem.setPreferredSize(new java.awt.Dimension(75, 30));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setBorder(null);
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.setPreferredSize(new java.awt.Dimension(86, 55));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoaT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnXoaT.setText("Xóa trắng");
        btnXoaT.setBorder(null);
        btnXoaT.setBorderPainted(false);
        btnXoaT.setPreferredSize(new java.awt.Dimension(82, 55));
        btnXoaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Tên tài khoản", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(fHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    	selectRowTable();
    }//GEN-LAST:event_tableMouseClicked

	private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCapNhatActionPerformed
		String userName = jbTK.getText();
		String password = jtMK.getText();
		TaiKhoan taiKhoan = taiKhoanDao.getTaiKhoanByUserName(userName);
		if(taiKhoan == null) {
			JOptionPane.showMessageDialog(btnCapNhat, "Không tìm thấy tài khoản muốn cập nhật", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		taiKhoan.setTenTaiKhoan(userName);
		taiKhoan.setMatKhau(password);
		taiKhoanDao.updateTaiKhoan(taiKhoan);
		updateTable(taiKhoan);
		xoaTrang();
		
	}// GEN-LAST:event_btnCapNhatActionPerformed

	private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimActionPerformed
		String ma = jtMa.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for(int i = 0; i < table.getRowCount();i++) {
			if(ma.equalsIgnoreCase(model.getValueAt(i, 0).toString())) {
				table.setRowSelectionInterval(i, i);
			}
		}
		selectRowTable();
		
		
	}// GEN-LAST:event_btnTimActionPerformed

	private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
		String userName = jbTK.getText().trim();
		String password = jtMK.getText();
		TaiKhoan taiKhoan = new TaiKhoan(userName, password);
		int check = checkValue(taiKhoan);
		if(check > 0) {
			showMessageValue(check);
			return;
		}
		if(taiKhoanDao.getTaiKhoanByUserName(userName) != null) {
			JOptionPane.showMessageDialog(btnCapNhat, "Tên tài khoản đã tồn tại", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		nhanVien = nhanVienDao.getNhanVienByMa(jtMa.getText());
		if(nhanVien == null) {
			JOptionPane.showMessageDialog(btnCapNhat, "Nhân viên không tồn tại", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		taiKhoan.setNhanVien(nhanVien);
		taiKhoanDao.addTaiKhoan(taiKhoan);
		addRowTable(taiKhoan);
		xoaTrang();
		
	}// GEN-LAST:event_btnThemActionPerformed

	
	private void showMessageValue(int check) {
		switch (check) {
		case 1:
			JOptionPane.showMessageDialog(btnThem, "User không được chưa ký tự đặc biệt và khoảng trắng", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(btnThem, "Ký tự đầu tiên phải viết hoa, phải cả số và chữ, ít nhất 8 ký tự và không quá 20 ký tự", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	
	private int checkValue(TaiKhoan taiKhoan) {
		if(!taiKhoan.getTenTaiKhoan().matches("^[a-zA-Z0-9]+$")) {
			return 1;
		}
		if(!taiKhoan.getMatKhau().matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,20}$")) {
			return 2;
		}
		return 0;
	}
	
	private void addRowTable(TaiKhoan taiKhoan) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] {taiKhoan.getNhanVien().getMaNhanVien(), taiKhoan.getNhanVien().getHoTen(),
					taiKhoan.getTenTaiKhoan(), taiKhoan.getMatKhau()});
		model.fireTableDataChanged();
	}
	
	private void updateTable(TaiKhoan taiKhoan) {
		String ma = jtMa.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for(int i = 0; i < table.getRowCount();i++) {
			if(ma.equalsIgnoreCase(model.getValueAt(i, 0).toString())) {
				model.setValueAt(taiKhoan.getTenTaiKhoan(), i, 2);
				model.setValueAt(taiKhoan.getMatKhau(), i, 3);
			}
		}
		model.fireTableDataChanged();
		
	}
	private void addDataArea(NhanVien nhanVien) {
		jtaNV.setText("");
		String tbMa = 	"Mã nhân viên	: ";
		String tbCccd = "\n\nCCCD	: ";
		String tbTen =  "\n\nHọ tên	: ";
		String tbNs= 	"\n\nNgày sinh	: ";
		String tbGt = 	"\n\nGiới tính	: ";
		String tbDc = 	"\n\nĐịa chỉ	: ";
		String tbEm = 	"\n\nEmail	: ";
		String tbSdt = 	"\n\nSố điện thoại	: ";
		String tbTt= 	"\n\nTrạng thái	: ";
		jtaNV.append(tbMa+nhanVien.getMaNhanVien());
		jtaNV.append(tbCccd+nhanVien.getCccd());
		jtaNV.append(tbTen+nhanVien.getHoTen());
		jtaNV.append(tbNs+nhanVien.getNgaySinh().toString());
		jtaNV.append(tbGt+(nhanVien.isGioiTinh() ? "Nam" : "Nữ"));
		jtaNV.append(tbDc+nhanVien.getDiaChi());
		jtaNV.append(tbEm+nhanVien.getEmail());
		jtaNV.append(tbSdt+nhanVien.getSdt());
		jtaNV.append(tbTt+(nhanVien.getTrangThai() ? "Đang làm" : "Nghỉ làm"));
		
	}
	
	private void btnXoaTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaTActionPerformed
		xoaTrang();
	}// GEN-LAST:event_btnXoaTActionPerformed

	private void xoaTrang() {
		jtMa.setText("");
		jtMa.setFocusable(true); 
		jtTen.setText("");
		jtTen.setFocusable(true);
		jbTK.setText("");
		jtMK.setText("");
	}
	
	private void selectRowTable() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int index = table.getSelectedRow();
		if(index < 0) {
			JOptionPane.showMessageDialog(btnTim, "Chưa chọn tài khoản", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		jtMa.setText(model.getValueAt(index, 0).toString());
		jtMa.setFocusable(false);
		jtTen.setText(model.getValueAt(index, 1).toString());
		jtTen.setFocusable(false);
		jbTK.setText(model.getValueAt(index, 2).toString());
		jtMK.setText(model.getValueAt(index, 3).toString());
		NhanVien nhanVien = nhanVienDao.getNhanVienByMa(jtMa.getText());
		addDataArea(nhanVien);
	}
	
	private void addDatatable() {

		List<TaiKhoan> list = taiKhoanDao.getAllTaiKhoan();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for (TaiKhoan taiKhoan : list) {
			model.addRow(new Object[] { taiKhoan.getNhanVien().getMaNhanVien(), taiKhoan.getNhanVien().getHoTen(),
					taiKhoan.getTenTaiKhoan(), taiKhoan.getMatKhau() });
		}
		model.fireTableDataChanged();
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoaT;
    private form.Form fHienThi;
    private form.Form fNhap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jbTK;
    private javax.swing.JTextField jtMK;
    private javax.swing.JTextField jtMa;
    private javax.swing.JTextField jtTen;
    private javax.swing.JTextArea jtaNV;
    private javax.swing.JLabel lbMK;
    private javax.swing.JLabel lbMa1;
    private javax.swing.JLabel lbTK;
    private javax.swing.JLabel lbTen1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
