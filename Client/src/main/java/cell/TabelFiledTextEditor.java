
package cell;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TabelFiledTextEditor extends DefaultCellEditor{
    private PanelField field;
    public TabelFiledTextEditor(){
        super(new JCheckBox());
        field = new PanelField();
    }

    
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {    
        return field;  
    }

    @Override
    public Object getCellEditorValue() {
//        field.UpdateData();
//        System.out.println(field.getJtTen());
        return field;
    }
    
}
