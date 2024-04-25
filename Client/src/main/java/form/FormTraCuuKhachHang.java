package form;

import dao.KhachHangDao;
import entity.KhachHang;
import jakarta.persistence.EntityManagerFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;




public class FormTraCuuKhachHang extends javax.swing.JPanel {
    private EntityManagerFactory emf;
    private KhachHangDao khachHangDao;

    public FormTraCuuKhachHang(EntityManagerFactory emf) {
        this.emf = emf;
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin khách hàng", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setPreferredSize(new Dimension(30,30));
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        khachHangDao = new KhachHangDao(emf);
		List<KhachHang> list = khachHangDao.getAllKhachHang();
		addDataTable(list);
  }
        private void addDataTable(List<KhachHang> list) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
                int i = 1;
		for (KhachHang khachHang : list) {
			Object[] row = { ""+i++, khachHang.getCccd(), khachHang.getHoTen(), khachHang.getEmail(), khachHang.getSdt(),
					khachHang.getDoiTuong() };
			model.addRow(row);
		}
		model.fireTableDataChanged();
	}
//    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {
//		
//	}
    private void xoaTrang() {
		jtMaKH.setText("");
		jtTenKH.setText("");
		table.clearSelection();
		List<KhachHang> list = khachHangDao.getAllKhachHang();
		addDataTable(list);
	}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        formThongTin = new form.Form();
        lbMaKH = new javax.swing.JLabel();
        jtMaKH = new javax.swing.JTextField();
        lbTenKH = new javax.swing.JLabel();
        jtTenKH = new javax.swing.JTextField();
        btnXoaTrang = new javax.swing.JButton();
        btnTraCuu = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "CCCD", "Họ tên", "Email", "Số điện thoại", "Đối tượng"
            }
        ));
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        lbMaKH.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMaKH.setForeground(new java.awt.Color(255, 255, 255));
        lbMaKH.setText("CCCD/Hộ chiếu");

        jtMaKH.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaKH.setBorder(null);
        jtMaKH.setPreferredSize(new java.awt.Dimension(300, 40));

        lbTenKH.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTenKH.setForeground(new java.awt.Color(255, 255, 255));
        lbTenKH.setText("Tên khách hàng");

        jtTenKH.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtTenKH.setBorder(null);
        jtTenKH.setPreferredSize(new java.awt.Dimension(64, 40));
        jtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTenKHActionPerformed(evt);
            }
        });

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

        btnTraCuu.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuu.setText("Tra Cứu");
        btnTraCuu.setBorder(null);
        btnTraCuu.setBorderPainted(false);
        btnTraCuu.setFocusPainted(false);
        btnTraCuu.setPreferredSize(new java.awt.Dimension(103, 55));
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaKH)
                    .addComponent(lbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtTenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addComponent(jtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formThongTinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaKH)
                    .addComponent(jtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenKH)
                    .addComponent(jtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(346, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTenKHActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        xoaTrang();
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        // TODO add your handling code here:
        String tieuChi = "";
		if (!jtMaKH.getText().trim().equalsIgnoreCase("")) {
			tieuChi = jtMaKH.getText();
			List<KhachHang> list = new ArrayList<KhachHang>();
			KhachHang khachHang = khachHangDao.getKhachHangByCCCD(tieuChi);
			list.add(khachHang);
			addDataTable(list);
		} else if (tieuChi.isEmpty()){
			JOptionPane.showMessageDialog(btnTraCuu, "Chưa nhập tiêu chí tìm kiếm", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		} 
    }//GEN-LAST:event_btnTraCuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaTrang;
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtMaKH;
    private javax.swing.JTextField jtTenKH;
    private javax.swing.JLabel lbMaKH;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
