package component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Herder extends javax.swing.JPanel {

    public Herder(String userName, String root) {
        initComponents();
        lbName.setText(userName);
        lbRoot.setText(root.equalsIgnoreCase("Admin") ? "Quản lý" : "Nhân viên");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        lbIconUser = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbRoot = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(60, 135, 210));
        setToolTipText("ĐẠI LÝ BÁN VÉ TÀU APLUS");
        setPreferredSize(new java.awt.Dimension(2000, 100));

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("ỨNG DỤNG BÁN VÉ TÀU TẠI ĐẠI LÝ APLUS");

        lbIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nhanvien.png"))); // NOI18N

        lbName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbName.setText("Tên Nhân viên");

        lbRoot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRoot.setForeground(new java.awt.Color(51, 51, 51));
        lbRoot.setText("Quản lý");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 1895, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbName)
                    .addComponent(lbRoot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIconUser)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbRoot))
                    .addComponent(lbIconUser))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#56CCF2"), 0, getHeight(), Color.decode("#56CCF2"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbIconUser;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbRoot;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
