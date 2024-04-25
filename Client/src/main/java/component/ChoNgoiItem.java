
package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import entity.ChoNgoi;


public class ChoNgoiItem extends javax.swing.JPanel {

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }
    
    private int viTri;
    
    private boolean selected;
    
    private ChoNgoi choNgoi;
    private boolean busy;

    public boolean isSelected() {
        return selected;
    }
    
    
    

    public ChoNgoi getChoNgoi() {
		return choNgoi;
	}

	public void setChoNgoi(ChoNgoi choNgoi) {
		this.choNgoi = choNgoi;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    public ChoNgoiItem() {
        initComponents();
        
    }
    
    public void setChoNgoi(int viTri){
        this.viTri = viTri;
        lbVT.setText(viTri+"");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVT = new javax.swing.JLabel();

        lbVT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbVT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVT.setText("1");
        lbVT.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        if (selected && choNgoi != null) {
            g2.setColor(new Color(53, 120, 189));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        }
        if(choNgoi == null) {
        	g2.setColor(new Color(229, 8, 8));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        }
        g2.dispose();

        super.paintChildren(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbVT;
    // End of variables declaration//GEN-END:variables
}
