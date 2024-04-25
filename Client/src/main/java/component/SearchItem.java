
package component;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SearchItem extends javax.swing.JPanel {


    public SearchItem(DataSearch data) {
        initComponents();
        addEventMouse(this);
        lbText.setText(data.getText());
    }

    private void addEventMouse(Component com) {
        com.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(new Color(215, 216, 216));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(Color.WHITE);
            }

        });
    }
    
    private ActionListener eventClick;

    public void addEvent(ActionListener eventClick){
        this.eventClick = eventClick;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbText.setBackground(new java.awt.Color(255, 255, 255));
        lbText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbText.setForeground(new java.awt.Color(54, 54, 54));
        lbText.setText("Text...");
        lbText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTextMouseClicked
        eventClick.actionPerformed(null);
    }//GEN-LAST:event_lbTextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbText;
    // End of variables declaration//GEN-END:variables
}
