package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;




public class FormTraCuuVe extends javax.swing.JPanel {

    public FormTraCuuVe() {
        initComponents();
        formThongTin.setBorder(new EmptyBorder(0, 0, 0, 0));
        formThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin vé", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setPreferredSize(new Dimension(30,30));
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        formThongTin = new form.Form();
        lbMaVe = new javax.swing.JLabel();
        jtMaVe = new javax.swing.JTextField();
        lbCCCD = new javax.swing.JLabel();
        jtCCCD = new javax.swing.JTextField();
        lbHoTen = new javax.swing.JLabel();
        jtHoTen = new javax.swing.JTextField();
        btnXoaTrang = new javax.swing.JButton();
        btnTraCuu = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 968));

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã vé", "Mác tàu", "Ga đi", "Ga đến", "Thời gian khởi hành", "CCCD", "Họ tên", "Đối tượng", "Khuyến mãi", "Bảo hiểm ", "Thông tin vé", "Thành tiền(VNĐ)", "Trạng thái"
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
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(8).setResizable(false);
            table.getColumnModel().getColumn(9).setResizable(false);
        }

        lbMaVe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMaVe.setForeground(new java.awt.Color(255, 255, 255));
        lbMaVe.setText("Mã vé");

        jtMaVe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMaVe.setBorder(null);
        jtMaVe.setPreferredSize(new java.awt.Dimension(300, 40));
        jtMaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaVeActionPerformed(evt);
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

        lbHoTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(255, 255, 255));
        lbHoTen.setText("Họ tên ");

        jtHoTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtHoTen.setBorder(null);
        jtHoTen.setPreferredSize(new java.awt.Dimension(64, 40));
        jtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHoTenActionPerformed(evt);
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
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addComponent(lbHoTen)
                        .addGap(31, 31, 31)
                        .addComponent(jtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formThongTinLayout.createSequentialGroup()
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaVe)
                            .addComponent(lbCCCD))
                        .addGap(37, 37, 37)
                        .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtMaVe, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formThongTinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        formThongTinLayout.setVerticalGroup(
            formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formThongTinLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaVe)
                    .addComponent(jtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCCCD)
                    .addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoTen))
                .addGap(40, 40, 40)
                .addGroup(formThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(307, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 397, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCCCDActionPerformed

    private void jtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHoTenActionPerformed

    private void jtMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMaVeActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        jtMaVe.setText("");
        jtCCCD.setText("");
        jtHoTen.setText("");
    }//GEN-LAST:event_btnXoaTrangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaTrang;
    private form.Form formThongTin;
    private javax.swing.ButtonGroup groupRadio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtCCCD;
    private javax.swing.JTextField jtHoTen;
    private javax.swing.JTextField jtMaVe;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaVe;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
