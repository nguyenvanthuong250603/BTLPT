
package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.Model_Tau;

public class TauItem extends javax.swing.JPanel {

    public boolean isSeleted() {
        return seleted;
    }

    public void setSeleted(boolean seleted) {
        this.seleted = seleted;
        repaint();
    }


    private boolean seleted;
    public TauItem() {
        initComponents();
        setOpaque(false);
    }

    public Model_Tau getData() {
        return data;
    }

    private Model_Tau data;
    public void setData(Model_Tau data){
        this.data = data;
        lbTen.setText(data.getTenTau());
        lbifTGDi.setText(data.getTGDi());
        lbifTGDen.setText(data.getTGDen());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbDi = new javax.swing.JLabel();
        lbDen = new javax.swing.JLabel();
        lbifTGDi = new javax.swing.JLabel();
        lbifTGDen = new javax.swing.JLabel();
        lbTen = new javax.swing.JLabel();

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/train.png"))); // NOI18N

        lbDi.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbDi.setText("TG đi");

        lbDen.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbDen.setText("TG đến");

        lbifTGDi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbifTGDi.setText("08/04/2024 08:30");

        lbifTGDen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbifTGDen.setText("08/04/2024 09:15");

        lbTen.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        lbTen.setText("SE10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(lbifTGDen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbifTGDi))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTen)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lbIcon)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDi)
                    .addComponent(lbifTGDi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDen)
                    .addComponent(lbifTGDen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(202, 205, 203));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        if(seleted){
           g2.setColor(new Color(86, 204, 242));
           g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        }
        g2.dispose();
        
        super.paintChildren(g);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDen;
    private javax.swing.JLabel lbDi;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbifTGDen;
    private javax.swing.JLabel lbifTGDi;
    // End of variables declaration//GEN-END:variables
}
