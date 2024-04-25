
package swing;

import event.EventMenuSelected;
import model.Model_Menu;
import event.EvenMenu;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

public class MenuItem extends javax.swing.JPanel {

    private float alpha;
    private Model_Menu menu;
    private boolean open;
    private EventMenuSelected eventSelected;
    private int index;

    public boolean isOpen() {
        return open;
    }

    public EventMenuSelected getEventSelected() {
        return eventSelected;
    }

    public int getIndex() {
        return index;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setEventSelected(EventMenuSelected eventSelected) {
        this.eventSelected = eventSelected;
    }

    
    public MenuItem(Model_Menu menu, EvenMenu evenMenu,EventMenuSelected eventSeleted, int inedx) {
        initComponents();
        this.menu = menu;
        this.eventSelected = eventSeleted;
        this.index = inedx;
        setOpaque(false);
        setLayout(new MigLayout("wrap, fillx, insets 0", "[fill]", "[fill, 64!]0[fill, 55!]"));
        MenuButton firstItem = new MenuButton("    "+menu.getName(),menu.getIcon());
        firstItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (menu.getSubMenu().length > 0) {
                    if (evenMenu.menuPressed(MenuItem.this, !open)) {
                        open = !open;
                    }
                }
                eventSelected.menuSelected(index, -1);
            }
            
        });
        add(firstItem);
        int subMenuIndex = -1;
        for(String st: menu.getSubMenu()){
            MenuButton item = new MenuButton(st);
            item.setIndex(++subMenuIndex);
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    eventSelected.menuSelected(index, item.getIndex());
                }
            });
            add(item);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getPreferredSize().height;
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(50, 50, 50));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2.fillRect(0, 2, width, height-55);
        g2.fillRect(0, 65, width, height-55);
        g2.setComposite(AlphaComposite.SrcOver);

        g2.setColor(new Color(255, 255, 255));
        g2.drawLine(30, 66, 30, height - 30);
        for (int i = 0; i < menu.getSubMenu().length; i++) {
            int y = ((i + 1) * 55 + 64) - 30;
            g2.drawLine(30, y, 38, y);
        }
        if (menu.getSubMenu().length > 0) {
            createArrowButton(g2);
        }
        super.paintComponent(grphcs);
    }
    
    private void createArrowButton(Graphics2D g2) {
        int size = 8;
        int y = 32;
        int x = 270;
        g2.setColor(new Color(60, 60, 60));
        float ay = alpha * size;
        float ay1 = (1f - alpha) * size;
        g2.drawLine(x, (int) (y + ay), x + 8, (int) (y + ay1));
        g2.drawLine(x + 8, (int) (y + ay1), x + 16, (int) (y + ay));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
