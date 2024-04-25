
package swing;

import java.awt.Color;
import java.awt.Dimension;


public class ScrollBar2 extends ScrollBar{
    public ScrollBar2() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(0, 0));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(0);
    }
    
}
