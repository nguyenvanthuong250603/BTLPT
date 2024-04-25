/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.KhachHangDao;
import entity.KhachHang;
import jakarta.persistence.EntityManagerFactory;
import model.AllDao;

/**
 *
 * @author HOANG
 */
public class GD_QuanLyKhachHang extends javax.swing.JPanel {

	/**
	 * Creates new form GD_QuanLyKhachHang
	 */
	
	private KhachHangDao khachHangDao;
	private AllDao allDao;
	public GD_QuanLyKhachHang(AllDao allDao) throws RemoteException {
		this.allDao = allDao;
		initComponents();

		jTable1.setShowGrid(false);
		jTable1.setShowHorizontalLines(false);
		jTable1.setShowVerticalLines(false);
		jTable1.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
		jTable1.getTableHeader().setPreferredSize(new Dimension(30, 30));
		((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

	
		List<KhachHang> list = allDao.getKhachHangDao().getAllKhachHang();
		addDataTable(list);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()  {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbCCCD = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbDT = new javax.swing.JLabel();
        
        txtCCCD = new javax.swing.JTextField();
        txtCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtTen = new javax.swing.JTextField();
        txtTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtEmail = new javax.swing.JTextField();
        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtSDT = new javax.swing.JTextField();
        txtSDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        cbBoxDT = new javax.swing.JComboBox<>();
        cbBoxDT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnCN = new javax.swing.JButton();
        btnXuatEX = new javax.swing.JButton();
        btnXT = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 83, 100));

        jLabel1.setBackground(new java.awt.Color(44, 83, 100));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CCCD", "Họ và Tên", "Email", "Số điện thoại", "Đối tượng"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
		jTable1.setRowHeight(30);
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tableMouseClicked(evt);
			}
		});
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        lbCCCD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCCCD.setText("CCCD:");

        lbTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTen.setText("Họ và tên: ");

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEmail.setText("Email: ");

        lbSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSDT.setText("Số điện thoại: ");

        lbDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDT.setText("Đối tượng: ");

        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        cbBoxDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Trẻ em", "Người lớn", "Sinh viên", "Người cao tuổi" }));
        cbBoxDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        btnCN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCN.setText("Cập nhật");
        btnCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnCNActionPerformed(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnXuatEX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXuatEX.setText("Xuất Excel");
        btnXuatEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnXuatEXActionPerformed(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXT.setText("Xóa Trắng");
        btnXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnXTActionPerformed(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnTimActionPerformed(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSDT)
                            .addComponent(lbDT)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT)
                            .addComponent(cbBoxDT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen)
                            .addComponent(txtEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXuatEX, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBoxDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXuatEX, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void tableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableMouseClicked
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		int index = jTable1.getSelectedRow();
		if (index < 0)
			return;

		txtCCCD.setText(model.getValueAt(index, 0).toString());
		txtTen.setText(model.getValueAt(index, 1).toString());
		txtEmail.setText(model.getValueAt(index, 2).toString());
		txtSDT.setText(model.getValueAt(index, 3).toString());
		cbBoxDT.setSelectedItem(model.getValueAt(index, 4));

	}// GEN-LAST:event_tableMouseClicked

	private int checkData(KhachHang khachHang) {
		if (!khachHang.getCccd().trim().matches("\\d{12}")) {
			return 1;
		}
		if (!khachHang.getHoTen().trim().matches("^[^!@#$%^&*()\\d]+$")) {
			return 2;
		}
		if (!khachHang.getSdt().trim().matches("^0\\d{9,10}$")) {
			return 3;
		}
		if (!khachHang.getEmail().trim().matches("^[a-zA-Z0-9._%+-]+@(gmail|email)\\.com$")) {
			return 4;
		}
		return 0;
	}

	// show messager
	private void showMessageValue(int check) {
		switch (check) {
		case 1:
			JOptionPane.showMessageDialog(btnCN, "CCCD là 12 ký số", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(btnCN, "Họ tên không chứa số và ký tự đặc biệt", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			JOptionPane.showMessageDialog(btnCN, "Email không đúng(example@gmail.com)", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			
			JOptionPane.showMessageDialog(btnCN, "Số điện thoại không chính xác", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

	private void updateKhachHangTable(KhachHang khachHang) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		for (int i = 0; i < jTable1.getRowCount(); i++) {
			int index = jTable1.getRowCount();
			if (index == i) {
				model.setValueAt(khachHang.getCccd(), i, 0);
				model.setValueAt(khachHang.getHoTen(), i, 1);
				model.setValueAt(khachHang.getEmail(), i, 2);
				model.setValueAt(khachHang.getSdt(), i, 3);
				model.setValueAt(khachHang.getDoiTuong(), i, 4);
			}
		}
	}

	// Cập nhật KhachHang
	private void btnCNActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {// GEN-FIRST:event_btnCNActionPerformed
		String CCCD = txtCCCD.getText();
		String hoTen = txtTen.getText();
		String email = txtEmail.getText();
		String sdt = txtSDT.getText();
		String doiTuong = cbBoxDT.getSelectedItem().toString();

		KhachHang khachHang = new KhachHang(CCCD, hoTen, email, sdt, doiTuong);

		int check = checkData(khachHang);
		if (check > 0) {
			showMessageValue(check);
		} else {
		 allDao.getKhachHangDao().updateKhachHang(khachHang);
			updateKhachHangTable(khachHang);
			xoaTrang();
		}

	}// GEN-LAST:event_btnCNActionPerformed

	// Tìm khách hàng bằng số điện thoại
	private void btnTimActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {
		String tieuChi = "";
		if (!txtSDT.getText().trim().equalsIgnoreCase("")) {
			tieuChi = txtSDT.getText();
			List<KhachHang> list = new ArrayList<KhachHang>();
			KhachHang khachHang = allDao.getKhachHangDao().getKhachHangByPhoneNumber(tieuChi);
			list.add(khachHang);
			addDataTable(list);
		} else if (tieuChi.isEmpty()){
			JOptionPane.showMessageDialog(btnTim, "Chưa nhập tiêu chí tìm kiếm SĐT", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(btnCN, "Không tìm thấy khách hàng", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private void xoaTrang() throws RemoteException {
		txtCCCD.setText("");
		txtEmail.setText("");
		txtSDT.setText("");
		txtTen.setText("");
		cbBoxDT.setSelectedIndex(0);
		jTable1.clearSelection();
		List<KhachHang> list = allDao.getKhachHangDao().getAllKhachHang();
		addDataTable(list);
	}

	private void btnXTActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {// GEN-FIRST:event_btnXTActionPerformed
		xoaTrang();
	}// GEN-LAST:event_btnXTActionPerformed

	private void addDataTable(List<KhachHang> list) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		for (KhachHang khachHang : list) {
			Object[] row = { khachHang.getCccd(), khachHang.getHoTen(), khachHang.getEmail(), khachHang.getSdt(),
					khachHang.getDoiTuong() };
			model.addRow(row);
		}
		model.fireTableDataChanged();
	}
	
	private void  btnXuatEXActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {
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
            allDao.getKhachHangDao().writeToExcel(selectedFilePath+".xls");
            JOptionPane.showMessageDialog(btnXuatEX, "Lưu thành công", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
            System.out.println("File Excel đã được lưu thành công.");
        } else if (returnValue == JFileChooser.CANCEL_OPTION) {
            System.out.println("Người dùng đã hủy lựa chọn.");
        }
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCN;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXT;
    private javax.swing.JButton btnXuatEX;
    private javax.swing.JComboBox<String> cbBoxDT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbDT;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTen;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
