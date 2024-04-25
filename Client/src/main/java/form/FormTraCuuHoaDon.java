package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class FormTraCuuHoaDon extends javax.swing.JPanel {

    public FormTraCuuHoaDon() {
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin hoá đơn", 0, HEIGHT, new Font(Font.SANS_SERIF, Font.BOLD, 20) {
        }, Color.WHITE));
        tableTraCuuKM.setShowGrid(false);
        tableTraCuuKM.setShowHorizontalLines(false);
        tableTraCuuKM.setShowVerticalLines(false);
        tableTraCuuKM.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        tableTraCuuKM.getTableHeader().setPreferredSize(new Dimension(30, 30));
        ((DefaultTableCellRenderer) tableTraCuuKM.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTraCuuKM = new javax.swing.JTable();
        formThongTin = new form.Form();
        lbMaHD = new javax.swing.JLabel();
        jtMaHD = new javax.swing.JTextField();
        lbThoiGian = new javax.swing.JLabel();
        jtThoiGian = new javax.swing.JTextField();
        jCBThoiGian = new javax.swing.JComboBox<>();
        btnXoaTrang = new javax.swing.JButton();
        btnTraCuu = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        tableTraCuuKM.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableTraCuuKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hoá đơn", "CCCD", "Khách hàng", "Ngày lập", "Tổng tiền", "Trạng thái", "Ghi chú"
            }
        ));
        tableTraCuuKM.setRowHeight(30);
        jScrollPane1.setViewportView(tableTraCuuKM);
        if (tableTraCuuKM.getColumnModel().getColumnCount() > 0) {
            tableTraCuuKM.getColumnModel().getColumn(0).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(1).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(2).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(3).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(4).setResizable(false);
            tableTraCuuKM.getColumnModel().getColumn(5).setResizable(false);
        }

        lbMaHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMaHD.setForeground(new java.awt.Color(255, 255, 255));
        lbMaHD.setText("Mã hoá đơn");

        jtMaHD.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaHD.setBorder(null);
        jtMaHD.setPreferredSize(new java.awt.Dimension(300, 40));
        jtMaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaHDActionPerformed(evt);
            }
        });

        lbThoiGian.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        lbThoiGian.setText("Thời gian");

        jtThoiGian.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtThoiGian.setBorder(null);
        jtThoiGian.setPreferredSize(new java.awt.Dimension(64, 40));
        jtThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtThoiGianActionPerformed(evt);
            }
        });

        jCBThoiGian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020-2021", "2021-2022", "2022-2023", "2023-2024" }));
        jCBThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBThoiGianActionPerformed(evt);
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

        javax.swing.GroupLayout formThongTinLayout = new javax.swing.GroupLayout(formThongTin);
        formThongTin.setLayout(formThongTinLayout);
        formThongTinLayout.setHorizontalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaHD)
                    .addComponent(lbThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addComponent(jtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formThongTinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaHD)
                    .addComponent(jtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbThoiGian)))
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCBThoiGian)))
                .addGap(45, 45, 45)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtThoiGianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtThoiGianActionPerformed

    private void jCBThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBThoiGianActionPerformed

        String selectedValue = (String) jCBThoiGian.getSelectedItem();
        jtThoiGian.setText(selectedValue);

    }//GEN-LAST:event_jCBThoiGianActionPerformed

    private void jtMaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMaHDActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed

        jtMaHD.setText("");
        jtThoiGian.setText("");
    }//GEN-LAST:event_btnXoaTrangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaTrang;
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JComboBox<String> jCBThoiGian;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtMaHD;
    private javax.swing.JTextField jtThoiGian;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbThoiGian;
    private javax.swing.JTable tableTraCuuKM;
    // End of variables declaration//GEN-END:variables

}
