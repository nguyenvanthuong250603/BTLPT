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

import dao.KhuyenMaiDao;
import entity.KhuyenMai;
import jakarta.persistence.EntityManagerFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormTraCuuKhuyenMai extends javax.swing.JPanel {

    private EntityManagerFactory emf;
    private KhuyenMaiDao khuyenMaiDao;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public FormTraCuuKhuyenMai(EntityManagerFactory emf) {
        this.emf = emf;
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),
                "Thông tin khuyến mãi", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
        }, Color.WHITE));
        tableTraCuuKM.setShowGrid(false);
        tableTraCuuKM.setShowHorizontalLines(false);
        tableTraCuuKM.setShowVerticalLines(false);
        tableTraCuuKM.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        tableTraCuuKM.getTableHeader().setPreferredSize(new Dimension(30, 30));
        ((DefaultTableCellRenderer) tableTraCuuKM.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER);
        khuyenMaiDao = new KhuyenMaiDao(emf);
        List<KhuyenMai> list = khuyenMaiDao.getAllKhuyenMai();
        addDataTable(list);
    }

    private void addDataTable(List<KhuyenMai> list) {
        DefaultTableModel model = (DefaultTableModel) tableTraCuuKM.getModel();
        model.setRowCount(0);
        for (KhuyenMai khuyenMai : list) {
            Object[] row = {khuyenMai.getMaKhuyenMai(), khuyenMai.getTenKhuyenMai(),
                khuyenMai.getLoaiKhuyenMai(), khuyenMai.getSoLuongVe(), khuyenMai.getThoiGianBatDau(),
                khuyenMai.getThoiGianKetThuc(), khuyenMai.getChietKhau(), khuyenMai.isTrangThai() ? "Đang áp dụng" : "Tạm ngưng"};
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
        tableTraCuuKM = new javax.swing.JTable();
        formThongTin = new form.Form();
        lbMaKM = new javax.swing.JLabel();
        jtMaKM = new javax.swing.JTextField();
        lbTenKM = new javax.swing.JLabel();
        jtTenKM = new javax.swing.JTextField();
        lbChietKhau = new javax.swing.JLabel();
        jtChietKhau = new javax.swing.JTextField();
        lbNgayBatDauKM = new javax.swing.JLabel();
        jNgayBatDauKM = new com.toedter.calendar.JDateChooser();
        lbNgayKetThucKM = new javax.swing.JLabel();
        jNgayKetThucKM = new com.toedter.calendar.JDateChooser();
        btnXoaTrang = new javax.swing.JButton();
        btnTraCuu = new javax.swing.JButton();
        jMess = new javax.swing.JPanel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        tableTraCuuKM.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableTraCuuKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khuyến mãi", "Tên khuyến mãi", "Loại khuyến mãi", "Số lượng vé", "Ngày bắt đầu khuyến mãi", "Ngày ngày kết thúc khuyến mãi", "Chiết khấu", "Trạng thái"
            }
        ));
        tableTraCuuKM.setRowHeight(30);
        tableTraCuuKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTraCuuKMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTraCuuKM);
        if (tableTraCuuKM.getColumnModel().getColumnCount() > 0) {
            tableTraCuuKM.getColumnModel().getColumn(0).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(1).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(2).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(3).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(4).setMinWidth(150);
            tableTraCuuKM.getColumnModel().getColumn(5).setMinWidth(180);
            tableTraCuuKM.getColumnModel().getColumn(6).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(7).setResizable(false);
        }

        lbMaKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMaKM.setForeground(new java.awt.Color(255, 255, 255));
        lbMaKM.setText("Mã khuyến mãi");

        jtMaKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaKM.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jtMaKM.setPreferredSize(new java.awt.Dimension(300, 40));
        jtMaKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaKMActionPerformed(evt);
            }
        });

        lbTenKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTenKM.setForeground(new java.awt.Color(255, 255, 255));
        lbTenKM.setText("Tên khuyến mãi");

        jtTenKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtTenKM.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jtTenKM.setPreferredSize(new java.awt.Dimension(64, 40));
        jtTenKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTenKMActionPerformed(evt);
            }
        });

        lbChietKhau.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbChietKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbChietKhau.setText("Chiết khấu");

        jtChietKhau.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtChietKhau.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jtChietKhau.setMinimumSize(new java.awt.Dimension(64, 30));
        jtChietKhau.setPreferredSize(new java.awt.Dimension(64, 40));

        lbNgayBatDauKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbNgayBatDauKM.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayBatDauKM.setText("Ngày bắt đầu");

        jNgayBatDauKM.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jNgayBatDauKM.setAlignmentX(0.0F);
        jNgayBatDauKM.setAlignmentY(0.0F);
        jNgayBatDauKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jNgayBatDauKM.setPreferredSize(new java.awt.Dimension(88, 40));

        lbNgayKetThucKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbNgayKetThucKM.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayKetThucKM.setText("Ngày kết thúc");

        jNgayKetThucKM.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jNgayKetThucKM.setAlignmentX(0.0F);
        jNgayKetThucKM.setAlignmentY(0.0F);
        jNgayKetThucKM.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jNgayKetThucKM.setPreferredSize(new java.awt.Dimension(88, 40));

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

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTenKM, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbChietKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNgayBatDauKM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                            .addComponent(lbNgayKetThucKM, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTenKM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNgayBatDauKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formThongTinLayout.createSequentialGroup()
                                .addComponent(jtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jNgayKetThucKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtChietKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formThongTinLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaKM)
                    .addComponent(jtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenKM)
                    .addComponent(jtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChietKhau))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNgayBatDauKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayBatDauKM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNgayKetThucKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayKetThucKM))
                .addGap(31, 31, 31)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
                .addGap(6, 6, 6)
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
        String tieuChi = jtMaKM.getText().trim();
        if (!tieuChi.isEmpty()) {
            KhuyenMai khuyenMai = khuyenMaiDao.getKhuyenMaiByMa(tieuChi);
            if (khuyenMai != null) {
                List<KhuyenMai> list = new ArrayList<>();
                list.add(khuyenMai);
                addDataTable(list);
            } else {
                JOptionPane.showMessageDialog(jMess, "Không tìm thấy khuyến mãi với mã này", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(jMess, "Chưa nhập tiêu chí tìm kiếm", "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void jtMaKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMaKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMaKMActionPerformed

    private void tableTraCuuKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTraCuuKMMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableTraCuuKM.getModel();
        int index = tableTraCuuKM.getSelectedRow();
        if (index < 0) {
            return;
        }
        jtMaKM.setText(model.getValueAt(index, 0).toString());
        jtTenKM.setText(model.getValueAt(index, 1).toString());
        double chietKhau = 0.0;
        Object chietKhauObj = model.getValueAt(index, 6);
        if (chietKhauObj instanceof Double) {
            chietKhau = (Double) chietKhauObj;
        } else if (chietKhauObj instanceof String) {
            try {
                chietKhau = Double.parseDouble((String) chietKhauObj);
            } catch (NumberFormatException e) {
                // Xử lý nếu không thể chuyển đổi thành số
                e.printStackTrace();
            }
        }
        jtChietKhau.setText(String.valueOf(chietKhau));
        try {
            jNgayBatDauKM.setDate(format.parse(model.getValueAt(index, 4).toString()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
                try {
            jNgayKetThucKM.setDate(format.parse(model.getValueAt(index, 5).toString()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_tableTraCuuKMMouseClicked

    private void jtTenKMActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtTenKMActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jtTenKMActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaTrangActionPerformed
        jtMaKM.setText("");
        jtTenKM.setText("");
        jtChietKhau.setText("");
        jNgayBatDauKM.setDate(null);
        jNgayKetThucKM.setDate(null);
    }// GEN-LAST:event_btnXoaTrangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaTrang;
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JPanel jMess;
    private com.toedter.calendar.JDateChooser jNgayBatDauKM;
    private com.toedter.calendar.JDateChooser jNgayKetThucKM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtChietKhau;
    private javax.swing.JTextField jtMaKM;
    private javax.swing.JTextField jtTenKM;
    private javax.swing.JLabel lbChietKhau;
    private javax.swing.JLabel lbMaKM;
    private javax.swing.JLabel lbNgayBatDauKM;
    private javax.swing.JLabel lbNgayKetThucKM;
    private javax.swing.JLabel lbTenKM;
    private javax.swing.JTable tableTraCuuKM;
    // End of variables declaration//GEN-END:variables

}
