package gui;

import form.FormNhanVien;
import form.FormTaiKhoan;
import form.FormTraCuuHoaDon;
import form.FormTraCuuNhanVien;
import form.FormTraCuuKhuyenMai;
import form.FormTraCuuKhachHang;
import form.FormTraCuuVe;
import jakarta.persistence.EntityManagerFactory;
import model.AllDao;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.border.EmptyBorder;

public class GD_TraCuuNhanVien extends javax.swing.JPanel {

	private AllDao allDao;
    public GD_TraCuuNhanVien(AllDao allDao) throws RemoteException {
        initComponents();
        setBorder(new EmptyBorder(10, 10, 10, 10));
        this.allDao =allDao;
        btnTraCuuKhuyenMai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					mainForm1.showForm(new FormTraCuuKhuyenMai(allDao));
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        btnTraCuuNhanVien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					mainForm1.showForm(new FormTraCuuNhanVien(allDao));
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });

        mainForm1.showForm(new FormTraCuuNhanVien(allDao));
    }

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#2C5364"), 0, getHeight(), Color.decode("#2C5364"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainForm1 = new form.MainForm();
        btnTraCuuKhuyenMai = new javax.swing.JButton();
        btnTraCuuNhanVien = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 1100));

        mainForm1.setPreferredSize(new java.awt.Dimension(1600, 1000));

        btnTraCuuKhuyenMai.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuuKhuyenMai.setText("Tra cứu khuyến mãi");
        btnTraCuuKhuyenMai.setBorderPainted(false);
        btnTraCuuKhuyenMai.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTraCuuKhuyenMai.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhuyenMai.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 45));
        btnTraCuuKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuKhuyenMaiActionPerformed(evt);
            }
        });

        btnTraCuuNhanVien.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTraCuuNhanVien.setText("Tra cứu nhân viên");
        btnTraCuuNhanVien.setBorderPainted(false);
        btnTraCuuNhanVien.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTraCuuNhanVien.setMaximumSize(new java.awt.Dimension(120, 45));
        btnTraCuuNhanVien.setMinimumSize(new java.awt.Dimension(120, 45));
        btnTraCuuNhanVien.setPreferredSize(new java.awt.Dimension(120, 45));
        btnTraCuuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnTraCuuNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnTraCuuKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1179, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTraCuuNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraCuuKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraCuuKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraCuuKhuyenMaiActionPerformed

    private void btnTraCuuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraCuuNhanVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuuKhuyenMai;
    private javax.swing.JButton btnTraCuuNhanVien;
    private form.MainForm mainForm1;
    // End of variables declaration//GEN-END:variables
}
