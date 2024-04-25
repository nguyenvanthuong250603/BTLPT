
package component;

import event.EvenItemGaClick;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import net.miginfocom.swing.MigLayout;

public class PanelSearch extends javax.swing.JPanel {

    
    private EvenItemGaClick event;
    
    public void addEventClick(EvenItemGaClick event){
        this.event = event;
    }
    public PanelSearch() {
        initComponents();
        setLayout(new MigLayout("fillx","0[]0","0[]0"));
    }
    
    public void setData(List<DataSearch> data){
        this.removeAll();
        for(DataSearch d : data){
            SearchItem item = new SearchItem(d);
            item.addEvent(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    event.itemClick(d);
                }
                
            });
            this.add(item,"wrap");
        }
        repaint();
        revalidate();
    }

    public int getItemSize(){
        return getComponentCount();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
