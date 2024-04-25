package form;

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

import dao.NhanVienDao;
import entity.NhanVien;
import jakarta.persistence.EntityManagerFactory;

public class FormTraCuuNhanVien extends javax.swing.JPanel {

    private EntityManagerFactory emf;
    private NhanVienDao nhanVienDao;

    public FormTraCuuNhanVien(EntityManagerFactory emf) {
        this.emf = emf;
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
                "Thông tin nhân viên", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
        }, Color.WHITE));
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setPreferredSize(new Dimension(30, 30));
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        nhanVienDao = new NhanVienDao(emf);
        List<NhanVien> list = nhanVienDao.getAllNhanVien();
        addDataTable(list);
    }

    private void addDataTable(List<NhanVien> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        for (NhanVien nhanVien : list) {
            Object[] row = {nhanVien.getMaNhanVien(), nhanVien.getCccd(), nhanVien.getHoTen(),
                nhanVien.getNgaySinh(), nhanVien.isGioiTinh() ? "Nam" : "Nữ", nhanVien.getDiaChi(), nhanVien.getEmail(),
                nhanVien.getSdt(), nhanVien.getTrangThai() ? "Đang làm" : "Nghỉ làm"};
            model.addRow(row);
        }
        model.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        formThongTin = new form.Form();
        lbMaNV = new javax.swing.JLabel();
        jtMaNV = new javax.swing.JTextField();
        lbCCCD = new javax.swing.JLabel();
        jtCCCD = new javax.swing.JTextField();
        btnTraCuu = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        lbTrangThai = new javax.swing.JLabel();
        jMess = new javax.swing.JPanel();
        jcbTrangThai = new javax.swing.JComboBox<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "CCCD", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Email", "Số điện thoại", "Trạng thái"
            }
        ));
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

        jtMaNV.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaNV.setBorder(null);
        jtMaNV.setPreferredSize(new java.awt.Dimension(300, 40));
        jtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaNVActionPerformed(evt);
            }
        });

        lbCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbCCCD.setForeground(new java.awt.Color(255, 255, 255));
        lbCCCD.setText("CCCD");

        jtCCCD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtCCCD.setBorder(null);
        jtCCCD.setPreferredSize(new java.awt.Dimension(64, 40));
        jtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCCCDActionPerformed(evt);
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

        lbTrangThai.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(255, 255, 255));
        lbTrangThai.setText("Trạng thái");

        jMess.setBackground(new java.awt.Color(44, 83, 100));

        javax.swing.GroupLayout jMessLayout = new javax.swing.GroupLayout(jMess);
        jMess.setLayout(jMessLayout);
        jMessLayout.setHorizontalGroup(
            jMessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jMessLayout.setVerticalGroup(
            jMessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jcbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đang làm", "Nghỉ làm" }));
        jcbTrangThai.setSelectedItem(null);
        jcbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTrangThaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaNV)
                            .addComponent(lbCCCD)
                            .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formThongTinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNV)
                    .addComponent(jtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCCCD)
                    .addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTrangThai))
                .addGap(18, 18, 18)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        // TODO add your handling code here:
        String tieuChi = jtMaNV.getText().trim();
        if (!tieuChi.isEmpty()) {
            NhanVien nhanVien = nhanVienDao.getNhanVienByMa(tieuChi);
            if (nhanVien != null) {
                List<NhanVien> list = new ArrayList<>();
                list.add(nhanVien);
                addDataTable(list);
            } else {
                JOptionPane.showMessageDialog(jMess, "Không tìm thấy nhân viên với mã này", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(jMess, "Chưa nhập tiêu chí tìm kiếm", "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void jcbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTrangThaiActionPerformed

    private void jtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMaNVActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int index = table.getSelectedRow();
        if (index < 0) {
            return;
        }
        jtMaNV.setText(model.getValueAt(index, 0).toString());
        jtCCCD.setText(model.getValueAt(index, 1).toString());
        jcbTrangThai.setSelectedItem(model.getValueAt(index, 8));
    }//GEN-LAST:event_tableMouseClicked

    private void jtCCCDActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaTrangActionPerformed
        jtMaNV.setText("");
        jtCCCD.setText("");
        jcbTrangThai.setSelectedIndex(-1);

    }// GEN-LAST:event_btnXoaTrangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaTrang;
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JPanel jMess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTrangThai;
    private javax.swing.JTextField jtCCCD;
    private javax.swing.JTextField jtMaNV;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
