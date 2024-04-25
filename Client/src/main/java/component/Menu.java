package component;

import event.EventShowPopupMenu;
import event.EventMenuSelected;
import event.EvenMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import model.Model_Menu;
import net.miginfocom.swing.MigLayout;

import swing.MenuAnimation;
import swing.MenuItem;
import swing.ScrollBarCustom;

public class Menu extends javax.swing.JPanel {

    public boolean isShowMenu() {
        return showMenu;
    }

    public void addEvent(EventMenuSelected event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public void addEventShowPopup(EventShowPopupMenu eventShowPopup) {
        this.eventShowPopup = eventShowPopup;
    }

    private final MigLayout layout;
    private EventMenuSelected event;
    private EventShowPopupMenu eventShowPopup;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setViewportBorder(null);

        sp.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }

    private void addMenu(Model_Menu menu) {
        panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 66!");
    }

    public void initMenuItem() {
        addMenu(new Model_Menu(new ImageIcon(getClass().getResource("/icon/ve.png")), "Quản lý vé", "Mua vé", "Đổi-Trả vé"));
        addMenu(new Model_Menu(new ImageIcon(getClass().getResource("/icon/khachhang.png")), "Khách Hàng"));
        addMenu(new Model_Menu(new ImageIcon(getClass().getResource("/icon/nhanvien.png")), "Nhân viên"));
        addMenu(new Model_Menu(new ImageIcon(getClass().getResource("/icon/khuyenmai.png")), "Khuyến Mãi", "Khuyến mãi trên hóa đơn", "Khuyến mãi trên khách hàng"));
        addMenu(new Model_Menu(new ImageIcon(getClass().getResource("/icon/thongke.png")), "Thống kê", "Thống kê doanh thu", "Thống kê lượt vé", "Thống kê đi lại", "Thống kê vé bán"));
        addMenu(new Model_Menu(new ImageIcon(getClass().getResource("/icon/tracuu.png")), "Tra cứu", "Tra cứu nhân viên", "Tra cứu khuyến mãi"));
        addMenu(new Model_Menu(new ImageIcon(getClass().getResource("/icon/help.png")), "Hỗ trợ"));
    }

    private EvenMenu getEventMenu() {
        return new EvenMenu() {
            @Override
            public boolean menuPressed(Component com, boolean open) {

                if (enableMenu) {
                    if (isShowMenu()) {
                        if (open) {
                            hideallMenu();
                            new MenuAnimation(layout, com).openMenu();
                        } else {
                            new MenuAnimation(layout, com).closeMenu();
                        }
                        return true;
                    } else {
                        eventShowPopup.showPopup(com);
                    }
                }
                return false;
            }
        };
    }

//    Tắt menu đang select
    public void hideallMenu() {
        for (Component com : panel.getComponents()) {
            MenuItem item = (MenuItem) com;
            if (item.isOpen()) {
                new MenuAnimation(layout, com, 200).closeMenu();
                item.setOpen(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        btnThoat = new swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(300, 1100));

        Logo.setOpaque(false);
        Logo.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        sp.setAlignmentX(0.0F);
        sp.setAlignmentY(0.0F);
        sp.setOpaque(false);
        sp.setPreferredSize(new java.awt.Dimension(333, 900));
        sp.setViewportView(null);

        panel.setAlignmentX(0.0F);
        panel.setAlignmentY(0.0F);
        panel.setMaximumSize(new java.awt.Dimension(333, 900));
        panel.setOpaque(false);
        panel.setPreferredSize(new java.awt.Dimension(333, 900));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);
        panel.getAccessibleContext().setAccessibleName("");
        panel.getAccessibleContext().setAccessibleDescription("");

        btnThoat.setBorder(null);
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thoat.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#56CCF2"), 0, getHeight(), Color.decode("#2F80ED"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintChildren(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logo;
    private swing.Button btnThoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
