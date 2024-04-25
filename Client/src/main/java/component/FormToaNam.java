
package component;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import entity.ChoNgoi;
import entity.Chuyen;
import model.Model_InfoVe;
import model.Model_Tau;

public class FormToaNam extends javax.swing.JPanel {

    private int soLuong;
    private List<ChoNgoi> list;
    private Map<String, Set<ChoNgoi>> listChon;
    private DefaultTableModel model;
    private Model_Tau chuyen;
    private List<Model_InfoVe> listInfoVes;
    public FormToaNam(int soluong,Model_Tau chuyen2,List<ChoNgoi> list,Map<String, Set<ChoNgoi>> listChoChon,DefaultTableModel model, List<Model_InfoVe> listInfoVes) {
        initComponents();
        setOpaque(false);
        this.list = list;
        this.soLuong = soluong;
        this.model = model;
        this.listChon = listChoChon;
        this.chuyen = chuyen2;
        this.listInfoVes = listInfoVes;
        addDataKhoangGhe();
        repaint();
        revalidate();
    }
    
    private void addDataKhoangGhe(){
        for(int i=1; i<= 6; i++){
            addItemKhoang(i,soLuong);
        }
    }

    public void addItemKhoang(int i,int soLuong){
        KhoangNam item = new KhoangNam(i,soLuong,list,model,listChon,chuyen,listInfoVes);
        listKhoangNam.add(item);
        listKhoangNam.repaint();
        listKhoangNam.revalidate();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listKhoangNam = new component.listKhoangNam();

        listKhoangNam.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listKhoangNam, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listKhoangNam, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.listKhoangNam listKhoangNam;
    // End of variables declaration//GEN-END:variables
}
