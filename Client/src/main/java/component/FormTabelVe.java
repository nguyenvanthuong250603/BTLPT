
package component;

import java.awt.Color;
import java.awt.Font;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.BorderFactory;

public class FormTabelVe extends javax.swing.JPanel {

    
    public FormTabelVe() {
        initComponents();
        setBackground(Color.white);
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Danh sách vé chọn", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.black));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
