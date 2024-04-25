package model;

import java.util.logging.Logger;
import javax.swing.Icon;

public class Model_Menu {

    
    Icon icon;
    String name;
    String subMenu[];

   

    public String getName() {
        return name;
    }

    public String[] getSubMenu() {
        return subMenu;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSubMenu(String[] subMenu) {
        this.subMenu = subMenu;
    }

    public Model_Menu() {
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Model_Menu(Icon icon, String name, String... subMenu) {
        this.icon = icon;
        this.name = name;
        this.subMenu = subMenu;
    }
    

    
        

}
