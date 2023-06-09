package wasp.gui.building;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

public class menus {

    public static JMenuBar menuBar(JMenuBar menuBarName, Color BackgroundColor, Border border) {
        menuBarName = new JMenuBar();
        menuBarName.setBackground(BackgroundColor);
        menuBarName.setBorder(border);
        return menuBarName;
    }

    public static JPopupMenu popupmenu(JPopupMenu popupmenuName, String popupmenuTitle, Color BackgroundColor, Border border ) {
        popupmenuName = new JPopupMenu(popupmenuTitle);
        popupmenuName.setBackground(BackgroundColor);
        popupmenuName.setBorder(border);
        return popupmenuName;
    }

    public static JMenu menu(JMenu menuName, String menuTitle, Color BackgroundColor, Border border) {
        menuName = new JMenu(menuTitle);
        menuName.setBackground(BackgroundColor);
        menuName.setBorder(border);
        return menuName;
    }

    public static JMenuItem menuItem(JMenuItem menuItemName, String menuItemTitle, Icon icon, Color BackgroundColor, Border border) {
        menuItemName = new JMenuItem(menuItemTitle, icon);
        menuItemName.setBackground(BackgroundColor);
        menuItemName.setBorder(border);
        return menuItemName;
    }

    public static JCheckBoxMenuItem checkBoxMenuItem(JCheckBoxMenuItem checkBoxMenuItemName, String checkBoxMenuItemTitle, Icon icon, Color BackgroundColor, Border border) {
        checkBoxMenuItemName = new JCheckBoxMenuItem(checkBoxMenuItemTitle, icon);
        checkBoxMenuItemName.setBackground(BackgroundColor);
        checkBoxMenuItemName.setBorder(border);
        return checkBoxMenuItemName;
    }

    public static JRadioButtonMenuItem radioButtonMenuItem(JRadioButtonMenuItem radioButtonMenuItemrName, String radioButtonMenuItemTitle, Color BackgroundColor, Border border) {
        radioButtonMenuItemrName = new JRadioButtonMenuItem(radioButtonMenuItemTitle);
        radioButtonMenuItemrName.setBackground(BackgroundColor);
        radioButtonMenuItemrName.setBorder(border);
        return radioButtonMenuItemrName;
    }

    public static JSeparator separator(JSeparator separatorName, Color BackgroundColor, Border border) {
        separatorName = new JSeparator();
        separatorName.setBackground(BackgroundColor);
        separatorName.setBorder(border);
        return separatorName;
    }
}