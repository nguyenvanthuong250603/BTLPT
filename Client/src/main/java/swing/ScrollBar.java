
package swing;
import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JScrollBar;

public class ScrollBar extends JScrollBar{
    public ScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(30);
    }
}
