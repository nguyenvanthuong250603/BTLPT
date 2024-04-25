
package gui;

import form.FormMuaVe;
import jakarta.persistence.EntityManagerFactory;
import model.AllDao;

import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import entity.TaiKhoan;

public class GD_MuaVe extends javax.swing.JPanel {

	private AllDao allDao;
	private TaiKhoan taiKhoan;
    public GD_MuaVe(AllDao allDao, TaiKhoan taiKhoan) throws RemoteException {
    	this.allDao = allDao;
    	this.taiKhoan = taiKhoan;
        initComponents();
        mainForm1.showForm(new FormMuaVe(mainForm1,allDao,taiKhoan));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupLanDi = new javax.swing.ButtonGroup();
        mainForm1 = new form.MainForm();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        setPreferredSize(new java.awt.Dimension(1600, 1100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 1594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupLanDi;
    private form.MainForm mainForm1;
    // End of variables declaration//GEN-END:variables

    public void remove(ActionListener aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
