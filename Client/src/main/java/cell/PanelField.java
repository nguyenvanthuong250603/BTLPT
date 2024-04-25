
package cell;


public class PanelField extends javax.swing.JPanel {

    public Object getJcbDoiTuong() {
        return jcbDoiTuong.getSelectedItem();
    }

    public void setJcbDoiTuong(JcomBox jcbDoiTuong) {
        this.jcbDoiTuong = jcbDoiTuong;
    }

    public String getJtGiayTo() {
        return jtGiayTo.getText();
    }

    public void setJtGiayTo(String giayTo) {
        this.jtGiayTo.setText(giayTo);
    }

    public String getJtTen() {
        return jtTen.getText();
    }

    public void setJtTen(String ten) {
        this.jtTen.setText(ten);
    }

    
    public void UpdateData(){
        SetTexTen();
        SetTexGiayTo();
    }
    
    public void SetTexTen(){
        setJtTen(jtTen.getText());
    }
    public void SetTexGiayTo(){
        setJtGiayTo(jtGiayTo.getText());
    }
    
    public PanelField() {
        initComponents();
//        UpdateData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtTen = new cell.FiledText();
        jLabel2 = new javax.swing.JLabel();
        jcbDoiTuong = new cell.JcomBox();
        jLabel3 = new javax.swing.JLabel();
        jtGiayTo = new cell.FiledText();

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Họ tên");

        jtTen.setToolTipText("");
        jtTen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtTen.setMinimumSize(new java.awt.Dimension(100, 35));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Đối tượng");

        jcbDoiTuong.setBorder(null);
        jcbDoiTuong.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jcbDoiTuong.setMinimumSize(new java.awt.Dimension(72, 35));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Số giấy tờ");

        jtGiayTo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtGiayTo.setPreferredSize(new java.awt.Dimension(64, 35));
        jtGiayTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGiayToActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbDoiTuong, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jtGiayTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDoiTuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtGiayTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtGiayToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGiayToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtGiayToActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private cell.JcomBox jcbDoiTuong;
    private cell.FiledText jtGiayTo;
    private cell.FiledText jtTen;
    // End of variables declaration//GEN-END:variables
}
