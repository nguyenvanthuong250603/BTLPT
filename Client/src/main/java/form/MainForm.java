
package form;

import java.awt.BorderLayout;
import java.awt.Component;

public class MainForm extends javax.swing.JPanel {

    public MainForm() {
        initComponents();
        setOpaque(false);
        setLayout(new BorderLayout());
//        setBorder(new EmptyBorder(10,20,10,20));
//        setBackground(new Color(0,0,0,0));
    }

    public void showForm(Component form){
        removeAll();
        add(form);
        repaint();
        revalidate();
    }
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
