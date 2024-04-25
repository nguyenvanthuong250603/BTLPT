
package gui;

import jakarta.persistence.EntityManagerFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import static java.awt.image.ImageObserver.HEIGHT;

import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.KhuyenMaiDao;
import entity.KhuyenMai;
import entity.NhanVien;

public class GD_KhuyenMaiTrenKhachHang extends javax.swing.JPanel {
    
    private EntityManagerFactory emf;
    private KhuyenMaiDao khuyenMaiDao;
    private SimpleDateFormat dinhDang = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private SimpleDateFormat dinhDangMa = new SimpleDateFormat("dd-MM-yyyy");
    LocalDate localDate = LocalDate.now();
	Date dateNow = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    
    public GD_KhuyenMaiTrenKhachHang(EntityManagerFactory emf) {
        this.emf = emf;
        initComponents();
        formText.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Thông tin khuyến mãi", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.BOLD,20) {
        }, Color.WHITE));
        formTable.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Bảng khuyến mãi trên khách hàng", 0, HEIGHT, new Font(Font.SANS_SERIF,Font.PLAIN,14) {
        }, Color.WHITE));
        
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
        table.getTableHeader().setPreferredSize(new Dimension(30,30));
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        khuyenMaiDao = new KhuyenMaiDao(emf);
		List<String> list = khuyenMaiDao.getAllKhuyenMaiKHLoai();
		List<KhuyenMai> listKM = khuyenMaiDao.getAllKhuyenMaiKH();
		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbDoiT.getModel();
		model.addElement("");
		list.stream().forEach(km->{
			model.addElement(km);
		});
		jcbDoiT.setModel(model);
		addDataTable(listKM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formTable = new form.Form();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        formText = new form.Form();
        lbMa = new javax.swing.JLabel();
        jtMa = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        jtTen = new javax.swing.JTextField();
        lbDoiT = new javax.swing.JLabel();
        jcbDoiT = new javax.swing.JComboBox<>();
        lbTimeStart = new javax.swing.JLabel();
        jDateStart = new com.toedter.calendar.JDateChooser();
        lbTimeEnd = new javax.swing.JLabel();
        jDateEnd = new com.toedter.calendar.JDateChooser();
        lbChietK = new javax.swing.JLabel();
        jtChietK = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnNgung = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLoc = new javax.swing.JButton();
        btnXoaT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1600, 1100));

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khuyến mãi", "Tên khuyến mãi", "Đối tượng", "Thời gian áp dụng", "Thời gian kết thúc", "Chiết khấu", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout formTableLayout = new javax.swing.GroupLayout(formTable);
        formTable.setLayout(formTableLayout);
        formTableLayout.setHorizontalGroup(
            formTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        formTableLayout.setVerticalGroup(
            formTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        lbMa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbMa.setForeground(new java.awt.Color(255, 255, 255));
        lbMa.setText("Mã khuyến mãi");

        jtMa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtMa.setBorder(null);
        jtMa.setMinimumSize(new java.awt.Dimension(64, 64));
        jtMa.setPreferredSize(new java.awt.Dimension(91, 40));

        lbTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTen.setForeground(new java.awt.Color(255, 255, 255));
        lbTen.setText("Tên khuyến mãi");

        jtTen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtTen.setBorder(null);
        jtTen.setMinimumSize(new java.awt.Dimension(64, 64));
        jtTen.setPreferredSize(new java.awt.Dimension(91, 40));

        lbDoiT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbDoiT.setForeground(new java.awt.Color(255, 255, 255));
        lbDoiT.setText("Đối tượng");

        jcbDoiT.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jcbDoiT.setBorder(null);
        jcbDoiT.setPreferredSize(new java.awt.Dimension(81, 40));

        lbTimeStart.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTimeStart.setForeground(new java.awt.Color(255, 255, 255));
        lbTimeStart.setText("Thời gian áp dụng");

        jDateStart.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jDateStart.setPreferredSize(new java.awt.Dimension(88, 40));

        lbTimeEnd.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbTimeEnd.setForeground(new java.awt.Color(255, 255, 255));
        lbTimeEnd.setText("Thời gian kết thúc");

        jDateEnd.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jDateEnd.setPreferredSize(new java.awt.Dimension(88, 40));

        lbChietK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbChietK.setForeground(new java.awt.Color(255, 255, 255));
        lbChietK.setText("Chiết khấu");

        jtChietK.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jtChietK.setBorder(null);
        jtChietK.setMinimumSize(new java.awt.Dimension(64, 64));
        jtChietK.setPreferredSize(new java.awt.Dimension(91, 40));

        javax.swing.GroupLayout formTextLayout = new javax.swing.GroupLayout(formText);
        formText.setLayout(formTextLayout);
        formTextLayout.setHorizontalGroup(
            formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTextLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDoiT)
                            .addComponent(lbTimeStart)
                            .addComponent(lbTimeEnd)
                            .addComponent(lbChietK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbDoiT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jtMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtChietK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbTen)
                    .addComponent(lbMa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formTextLayout.setVerticalGroup(
            formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTextLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa)
                    .addComponent(jtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen))
                .addGap(20, 20, 20)
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDoiT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDoiT))
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbTimeStart))
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formTextLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbTimeEnd)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formTextLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(formTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtChietK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChietK))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lbMa.getAccessibleContext().setAccessibleName("lbMa");

        btnTim.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.setBorder(null);
        btnTim.setBorderPainted(false);
        btnTim.setPreferredSize(new java.awt.Dimension(105, 55));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        btnThem.setPreferredSize(new java.awt.Dimension(96, 55));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnNgung.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnNgung.setText("Tạm ngưng");
        btnNgung.setBorder(null);
        btnNgung.setBorderPainted(false);
        btnNgung.setPreferredSize(new java.awt.Dimension(96, 55));
        btnNgung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgungActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setBorder(null);
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.setPreferredSize(new java.awt.Dimension(96, 55));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnLoc.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.setBorder(null);
        btnLoc.setBorderPainted(false);
        btnLoc.setPreferredSize(new java.awt.Dimension(96, 55));
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        btnXoaT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnXoaT.setText("Xóa trắng");
        btnXoaT.setBorder(null);
        btnXoaT.setBorderPainted(false);
        btnXoaT.setPreferredSize(new java.awt.Dimension(96, 55));
        btnXoaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNgung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNgung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        String ma = jtMa.getText();
        KhuyenMai khuyenMai = khuyenMaiDao.getKhuyenMaiByMa(ma);
        if(khuyenMai == null) {
        	JOptionPane.showMessageDialog(btnTim, "Không tồn tại khuyến mãi", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
        	return;
        }
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for(int i = 0; i < model.getRowCount();i++) {
        	if(khuyenMai.getMaKhuyenMai().equalsIgnoreCase(model.getValueAt(0, i).toString()))
        		table.setRowSelectionInterval(i, i);
        }
        selectedRowTable();
        
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnNgungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgungActionPerformed
        String ma = jtMa.getText();
        KhuyenMai khuyenMai = khuyenMaiDao.getKhuyenMaiByMa(ma);
        boolean trangThai = khuyenMai.isTrangThai();
        khuyenMai.setTrangThai(!trangThai);
        khuyenMaiDao.updateKhuyenMai(khuyenMai);
        xoaTrang();
        updateDataTable(khuyenMai);
        JOptionPane.showMessageDialog(btnTim, "Đã thay đổi trạng thái khuyến mãi " + khuyenMai.getMaKhuyenMai(), "Thông báo",
				JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnNgungActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
    	String ten = jtTen.getText().trim();
		String doiTuong = jcbDoiT.getSelectedItem().toString();
		String chietK = jtChietK.getText().trim();
		Date timeEnd = jDateEnd.getDate();
		Date timeStart = jDateStart.getDate();
		KhuyenMai khuyenMai = new KhuyenMai(ten, ten, doiTuong, timeStart, timeEnd, true);
		int check = checkData(khuyenMai, chietK);
		if (check > 0) {
			showMessageValue(check);
			return;
		}
		String numberMa = "KM" + dinhDangMa.format(timeStart).toString();
		List<KhuyenMai> list = khuyenMaiDao.getAllKhuyenMaiByNumber(numberMa);

		String index = (list.size() / 10 > 0) ? "" + list.size()+1 : "0" + list.size()+1;
		khuyenMai.setMaKhuyenMai(numberMa + index);
		khuyenMai.setSoLuongVe(0);
		khuyenMai.setChietKhau(Double.parseDouble(chietK));

		khuyenMaiDao.addKhuyenMai(khuyenMai);
		xoaTrang();
		addRowTable(khuyenMai);
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        selectedRowTable();
    }//GEN-LAST:event_tableMouseClicked

    private void btnXoaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTActionPerformed
        xoaTrang();
    }//GEN-LAST:event_btnXoaTActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String ma = jtMa.getText();
        Date timeEnd = jDateEnd.getDate();
        KhuyenMai khuyenMai = khuyenMaiDao.getKhuyenMaiByMa(ma);
        
        int check = checkDataUpdate(khuyenMai,timeEnd);
        if(check > 0) {
        	showMessageValue(check);
        	return;
        }
        khuyenMai.setThoiGianKetThuc(timeEnd);
        khuyenMai.setTrangThai(true);
        khuyenMaiDao.updateKhuyenMai(khuyenMai);
        updateDataTable(khuyenMai);
        xoaTrang();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void updateDataTable(KhuyenMai khuyenMai) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < table.getRowCount(); i++) {
			String cellValue = table.getValueAt(i, 0).toString();
			if (khuyenMai.getMaKhuyenMai().equalsIgnoreCase(cellValue)) {
				model.setValueAt(dinhDang.format(khuyenMai.getThoiGianKetThuc()).toString(), i, 4);
				model.setValueAt((khuyenMai.getThoiGianKetThuc()
						.before(dateNow) ? "Hết hạn"  : khuyenMai.isTrangThai() ?  "Đang áp dụng" : "Tạm ngưng"), i, 6);
			}
		}
    }
    
    private void addRowTable(KhuyenMai khuyenMai) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] { khuyenMai.getMaKhuyenMai(), khuyenMai.getTenKhuyenMai(), khuyenMai.getLoaiKhuyenMai(),
				dinhDang.format(khuyenMai.getThoiGianBatDau()).toString(),
				dinhDang.format(khuyenMai.getThoiGianKetThuc()).toString(), khuyenMai.getChietKhau(),
				(khuyenMai.getThoiGianKetThuc().before(dateNow) ? "Hết hạn"
						: khuyenMai.isTrangThai() ? "Đang áp dụng" : "Tạm ngưng") });
	}
    
    private int checkDataUpdate(KhuyenMai khuyenMai, Date timeEnd) {
		if (!khuyenMai.getTenKhuyenMai().equalsIgnoreCase(jtTen.getText())) {
			return 7;
		}
		if (!dinhDang.format(khuyenMai.getThoiGianBatDau()).toString().equalsIgnoreCase(dinhDang.format(jDateStart.getDate()).toString())) {		
			
			return 7;
		}
		if (!khuyenMai.getThoiGianKetThuc().before(timeEnd)) {
			return 6;
		}
		if(!khuyenMai.getLoaiKhuyenMai().equalsIgnoreCase(jcbDoiT.getSelectedItem().toString()))
			return 7;
		if (!(khuyenMai.getChietKhau() == Double.parseDouble(jtChietK.getText()))) {
			return 7;
		}
		return 0;
	}
    
    private int checkData(KhuyenMai khuyenMai , String trietKhau) {
		if (!khuyenMai.getTenKhuyenMai().matches("^[^!@#$%^&*()]+$")) {
			return 1;
		}
		if (khuyenMai.getThoiGianKetThuc().before(khuyenMai.getThoiGianBatDau())) {
			return 3;
		}
		if (!(Double.parseDouble(trietKhau) > 0 && Double.parseDouble(trietKhau) < 1)) {
			return 4;
		}
		return 0;
	}
    
    
    private void showMessageValue(int check) {
		switch (check) {
		case 1:
			JOptionPane.showMessageDialog(btnThem, "Tên không chứa ký tự đặc biệt", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(btnThem, "", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			JOptionPane.showMessageDialog(btnThem, "Chiết khấu phải lớn hơn không và nhỏ hơn 1", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			JOptionPane.showMessageDialog(btnThem, "Chiết khấu phải lớn hơn không và nhỏ hơn 1", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			JOptionPane.showMessageDialog(btnThem, "Ngày kết thúc mới phải sau ngày kết thúc cũ", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 7:
			JOptionPane.showMessageDialog(btnThem, "Chỉ được thay đổi trên ngày kết thúc", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
    
    
    private void xoaTrang() {
		jtMa.setText("");
		jtMa.setFocusable(true);
		jtTen.setText("");
		jcbDoiT.setSelectedIndex(0);
		jDateEnd.setDate(null);
		jDateStart.setDate(null);
		jtChietK.setText("");
	}
	
	private void selectedRowTable() {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
		int index = table.getSelectedRow();
		if(index < 0) {
			JOptionPane.showMessageDialog(btnTim, "Chưa chọn tài khoản", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		jtMa.setText(model.getValueAt(index, 0).toString());
		jtMa.setFocusable(false);
		jtTen.setText(model.getValueAt(index, 1).toString());
		jcbDoiT.setSelectedItem(model.getValueAt(index, 2));
		try {
			jDateStart.setDate(dinhDang.parse(model.getValueAt(index, 3).toString()));
			jDateEnd.setDate(dinhDang.parse(model.getValueAt(index, 4).toString()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jtChietK.setText(model.getValueAt(index, 5).toString());
	}
    
    private void addDataTable(List<KhuyenMai> list){
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		
		for (KhuyenMai khuyenMai : list) {
			Object[] row = {khuyenMai.getMaKhuyenMai(), khuyenMai.getTenKhuyenMai(), khuyenMai.getLoaiKhuyenMai(),
					dinhDang.format(khuyenMai.getThoiGianBatDau()).toString(), dinhDang.format(khuyenMai.getThoiGianKetThuc()).toString(),
					khuyenMai.getChietKhau(), (khuyenMai.getThoiGianKetThuc()
							.before(dateNow) ? "Hết hạn"  : khuyenMai.isTrangThai() ?  "Đang áp dụng" : "Tạm ngưng")};

			model.addRow(row);
		}
		model.fireTableDataChanged();
    }
    
    
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#085d81"), 0, getHeight(), Color.decode("#085d81"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnNgung;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoaT;
    private form.Form formTable;
    private form.Form formText;
    private com.toedter.calendar.JDateChooser jDateEnd;
    private com.toedter.calendar.JDateChooser jDateStart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbDoiT;
    private javax.swing.JTextField jtChietK;
    private javax.swing.JTextField jtMa;
    private javax.swing.JTextField jtTen;
    private javax.swing.JLabel lbChietK;
    private javax.swing.JLabel lbDoiT;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTimeEnd;
    private javax.swing.JLabel lbTimeStart;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
