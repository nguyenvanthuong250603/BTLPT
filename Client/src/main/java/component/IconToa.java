package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;

public class IconToa extends javax.swing.JPanel {

    public boolean isSeleted() {
        return seleted;
    }

    public void setSeleted(boolean seleted) {
        this.seleted = seleted;
        repaint();
    }

    private boolean seleted;

    public int getVitri() {
        return vitri;
    }
    private Icon icon;
    private int vitri;

    public IconToa() {
        initComponents();
        setOpaque(false);
    }

    public void setData(int vt) {
        this.vitri = vt;
        lbViTri.setText(vt + "");
    }
    public void setData(Icon icon,String name) {
        this.icon = icon;
        lbIconToa.setIcon(icon);
        lbViTri.setText(name);
    }

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        if (seleted) {
            g2.setColor(new Color(23, 175, 42));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        }
        g2.dispose();

        super.paintChildren(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIconToa = new javax.swing.JLabel();
        lbViTri = new javax.swing.JLabel();

        lbIconToa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/carriage.png"))); // NOI18N

        lbViTri.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbViTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbViTri.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconToa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbViTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbIconToa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbViTri))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIconToa;
    private javax.swing.JLabel lbViTri;
    // End of variables declaration//GEN-END:variables
}
