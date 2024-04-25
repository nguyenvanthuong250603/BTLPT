package gui;

import form.FormNhanVien;
import form.FormTaiKhoan;
import jakarta.persistence.EntityManagerFactory;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;


public class GD_QuanLyNhanVien extends javax.swing.JPanel {

	private EntityManagerFactory emf;
    public GD_QuanLyNhanVien(EntityManagerFactory emf) {
        initComponents();
        setBorder(new EmptyBorder(10,10,10,10));
        
        btnNhanVien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm1.showForm(new FormNhanVien(emf,mainForm1));
            }
        });
        btnTaiKhoan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm1.showForm(new FormTaiKhoan(emf,null));
            }
        });
        
        mainForm1.showForm(new FormNhanVien(emf,mainForm1));
    }


    
    
        @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#085d81"), 0, getHeight(), Color.decode("#085d81"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNhanVien = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        mainForm1 = new form.MainForm();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 1100));

        btnNhanVien.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setBorderPainted(false);
        btnNhanVien.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNhanVien.setMaximumSize(new java.awt.Dimension(120, 45));
        btnNhanVien.setMinimumSize(new java.awt.Dimension(120, 45));
        btnNhanVien.setPreferredSize(new java.awt.Dimension(120, 45));

        btnTaiKhoan.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTaiKhoan.setText("Tài khoản");
        btnTaiKhoan.setBorderPainted(false);
        btnTaiKhoan.setFocusTraversalPolicyProvider(true);
        btnTaiKhoan.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTaiKhoan.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTaiKhoan.setPreferredSize(new java.awt.Dimension(120, 45));

        mainForm1.setPreferredSize(new java.awt.Dimension(1600, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnTaiKhoan;
    private form.MainForm mainForm1;
    // End of variables declaration//GEN-END:variables
}
