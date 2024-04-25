
package cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableFieldTextCellRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        PanelField field = new PanelField();
        if (isSelected == false && row % 2 == 0) {
            field.setBackground(Color.WHITE);
        } else {
            field.setBackground(com.getBackground());
        }
        return field;
    }
    
}
