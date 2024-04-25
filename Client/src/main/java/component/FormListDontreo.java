
package component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

import dao.HoaDonDao;
import entity.HoaDon;
import jakarta.persistence.EntityManagerFactory;
import swing.ScrollBar;


public class FormListDontreo extends javax.swing.JFrame {


	private EntityManagerFactory emf;
	private HoaDonDao hoaDonDao;
	private HoaDon hoaDon;
	private List<HoaDon> list;
    public FormListDontreo(EntityManagerFactory emf) {
    	this.emf = emf;
    	this.list = new ArrayList<HoaDon>();
    	this.hoaDonDao = new HoaDonDao(emf);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Thông tin đơn treo");
        setLocationRelativeTo(null);
        setResizable(false);
        jpTraCuu.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin đơn đặt", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.PLAIN,17) {
        }, Color.black));
        jpTraCuu.setBackground(Color.white);
        table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setPreferredSize(new Dimension(30,30));
        scpTable.setVerticalScrollBar(new ScrollBar());
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        setAlwaysOnTop(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jpTraCuu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCCCD = new javax.swing.JTextField();
        jtSĐT = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnXuLy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CCCD", "Họ tên", "Số điện thoại", "Ngày lập", "Giờ lập", "Số lượng vé"
            }
        ));
        table.setRowHeight(30);
        scpTable.setViewportView(table);
        table.getAccessibleContext().setAccessibleParent(table);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("CCCD");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Sô điện thoại");

        jtCCCD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtCCCD.setPreferredSize(new java.awt.Dimension(64, 35));

        jtSĐT.setPreferredSize(new java.awt.Dimension(64, 35));

        btnTim.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.setBorder(null);
        btnTim.setPreferredSize(new java.awt.Dimension(75, 50));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnXuLy.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnXuLy.setText("Xử lý");
        btnXuLy.setBorder(null);
        btnXuLy.setPreferredSize(new java.awt.Dimension(75, 50));
        btnXuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuLyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTraCuuLayout = new javax.swing.GroupLayout(jpTraCuu);
        jpTraCuu.setLayout(jpTraCuuLayout);
        jpTraCuuLayout.setHorizontalGroup(
            jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTraCuuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtSĐT, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jtCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addGroup(jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTraCuuLayout.setVerticalGroup(
            jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTraCuuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTraCuuLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jpTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jpTraCuuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scpTable, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scpTable, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
       
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnXuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuLyActionPerformed
       
    }//GEN-LAST:event_btnXuLyActionPerformed


    public void SetDataListHoaDon() {
    	
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXuLy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpTraCuu;
    private javax.swing.JTextField jtCCCD;
    private javax.swing.JTextField jtSĐT;
    private javax.swing.JScrollPane scpTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
