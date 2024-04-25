
package swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;


public class Button extends JButton {

    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
    }

    private Color effectColor = new Color(255, 255, 255);

    public Button() {
        setContentAreaFilled(false);
        setFont(new Font(Font.SANS_SERIF,  Font.LAYOUT_RIGHT_TO_LEFT, 25));
        setBorderPainted(false);
        setOpaque(false);
        setForeground(effectColor);
        setBackground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                System.exit(0);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBackground().getAlpha() < 255) {
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        super.paintComponent(g);
    }
}
