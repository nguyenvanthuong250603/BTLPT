
package swing;

import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.DefaultListCellRenderer;

public class ListMenu < E extends Object> extends JList<E>{
    public ListMenu(){
        
    }
    @Override
    public ListCellRenderer<? super E> getCellRenderer(){
        return new DefaultListCellRenderer(){
            
        };
    }
}
