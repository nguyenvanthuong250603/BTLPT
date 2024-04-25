
package component;

import event.EventItemChoNgoi;
import model.Model_InfoVe;
import model.Model_Tau;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import entity.ChoNgoi;
import entity.Chuyen;


public class KhoangNam extends javax.swing.JPanel {

    
    private int vtKhoang;
    private int soLuong;
    private List<ChoNgoi> list;
    private DefaultTableModel model;
    private Map<String, Set<ChoNgoi>> listChon;
    private Model_Tau chuyen;
    private List<Model_InfoVe> listInfoVes;

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    

    public int getVtKhoang() {
        return vtKhoang;
    }

    public void setVtKhoang(int vtKhoang) {
        this.vtKhoang = vtKhoang;
        
    }
    
    
    public KhoangNam(int vtKhoang,int soLuong,List<ChoNgoi> list, DefaultTableModel model,Map<String, Set<ChoNgoi>> listChon2,Model_Tau chuyen2, List<Model_InfoVe> listInfoVes) {
        initComponents();
        this.soLuong = soLuong;
        this.list = list;
        this.vtKhoang = vtKhoang;
        this.model = model;
        this.listChon = listChon2;
        this.chuyen = chuyen2;
        this.listInfoVes = listInfoVes;
        lbVT.setText("Khoang "+vtKhoang);
        setOpaque(false);
        addDataGhe();
    }
    
    public EventItemChoNgoi getEvent() {
        return event;
    }

    public void setEvent(EventItemChoNgoi event) {
        this.event = event;
    }

    private EventItemChoNgoi event;
    private void addDataGhe(){
        setEvent(new EventItemChoNgoi() {
            @Override
            public void itemClick(Component com, ChoNgoi choNgoi) {
            	if(choNgoi != null)
            		setSeleted(com,choNgoi);
            }
        });     
        int temp = 0;
        for(int i = 1; i <= soLuong; i++){
        	temp = getIndexChoNgoiTrong(i);
            if(temp >= 0) {
            	if(checkDataSelect(list.get(temp)))
            		addItemGhe(i, list.get(temp), true);
            	else
            		addItemGhe(i, list.get(temp), false);
            }
            else
            	addItemGhe(i, null, true);
        }
    }
    
    private int getIndexChoNgoiTrong(int vt) {
    	int count = 0;
    	for(ChoNgoi choNgoi : list) {
    		if(choNgoi.getViTri()==vt && choNgoi.getMoTa().equals("Khoang "+vtKhoang))
    			return count;
    		count++;
    			
    	}
    	return -1;
    }
    
    private boolean checkDataSelect(ChoNgoi choNgoi) {
        for (Map.Entry<String, Set<ChoNgoi>> entry : listChon.entrySet()) {
            String maChuyen = entry.getKey();
            Set<ChoNgoi> danhSachChoNgoi = entry.getValue();
            for (ChoNgoi cn : danhSachChoNgoi) {
                if (cn.equals(choNgoi) && maChuyen.equalsIgnoreCase(chuyen.getChuyen().getMaChuyen())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void addItemGhe(int vt,ChoNgoi choNgoi,boolean select){
        ChoNgoiItem item = new ChoNgoiItem();
        item.setChoNgoi(choNgoi);
        item.setChoNgoi(vt);
        item.setSelected(select);
        item.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                event.itemClick(item, choNgoi);
            }
            
        });
        listChoNgoi.add(item);
        listChoNgoi.repaint();
        listChoNgoi.revalidate();
    }
    
    public int removeVes(List<Model_InfoVe> list, Model_InfoVe ve) {
		int count = 0;
		for (Model_InfoVe veinfo : list) {
			if (veinfo.getChuyen().getChuyen().getMaChuyen().equalsIgnoreCase(ve.getChuyen().getChuyen().getMaChuyen())
					&& veinfo.getChoNgoi().getMaChoNgoi().equalsIgnoreCase(ve.getChoNgoi().getMaChoNgoi()))
				return count;
			count++;
		}
		return -1;
	}

    
    
    public void setSeleted(Component item,ChoNgoi choNgoi){
    	String keyName = chuyen.getChuyen().getMaChuyen();
    	Model_InfoVe veInfo = new Model_InfoVe(chuyen, choNgoi,item);
    	int temp = 0;
        for(Component com : listChoNgoi.getComponents()){
            ChoNgoiItem i = (ChoNgoiItem) com;
            if(i.getViTri() == ((ChoNgoiItem)item).getViTri() && i.isSelected()){
                i.setSelected(false);
                if(listChon.containsKey(keyName)) {
                	Set<ChoNgoi> list = listChon.get(keyName);
                	list.remove(choNgoi);
                	temp = removeVes(listInfoVes, veInfo);
                	listInfoVes.remove(temp);
                	model.removeRow(temp);
                	model.fireTableDataChanged();
                }
                	
                return;
            }
        }
        ((ChoNgoiItem)item).setSelected(true);
        if(!listChon.containsKey(keyName)) {
        	Set<ChoNgoi> newCN = new HashSet<ChoNgoi>();
        	newCN.add(choNgoi);
        	listChon.put(keyName, newCN);
        }
        else {
        	listChon.get(keyName).add(choNgoi);
        }
        listInfoVes.add(veInfo);
        int gia = (int) Math.round(veInfo.getChoNgoi().getGia() * Math.abs(veInfo.getChuyen().getGaDi().getId()-veInfo.getChuyen().getGaDen().getId()));
        model.addRow(new Object[] {
        		"","","Người lớn",veInfo.toString(),gia,0,gia
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVT = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        jp2 = new javax.swing.JPanel();
        listChoNgoi = new component.listChoNgoi();

        lbVT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbVT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVT.setText("Khoang 1");

        jp1.setBackground(new java.awt.Color(102, 102, 102));
        jp1.setForeground(new java.awt.Color(51, 0, 51));
        jp1.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jp2.setBackground(new java.awt.Color(102, 102, 102));
        jp2.setForeground(new java.awt.Color(51, 0, 51));
        jp2.setPreferredSize(new java.awt.Dimension(4, 166));

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbVT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(listChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JLabel lbVT;
    private component.listChoNgoi listChoNgoi;
    // End of variables declaration//GEN-END:variables
}
