package wasp.gui.building;

import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class container {

    public static JPanel panel(JPanel panelName, Color PanelColor, LayoutManager Layot) {
        panelName = new JPanel();
        panelName.setBackground(PanelColor);
        panelName.setLayout(Layot);
        return panelName;
    }

    public static JTabbedPane tabbedPane(JTabbedPane paneName, Color BackgroundColor) {
        paneName = new JTabbedPane();
        paneName.setBackground(BackgroundColor);
        return paneName;
    }

    public static JSplitPane horizontalSplitPane(JSplitPane paneName) {
        paneName = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        return paneName;
    }

    public static JSplitPane verticalSplitPane(JSplitPane paneName) {
        paneName = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        return paneName;
    }

    public static JScrollPane scrollPane(JScrollPane scrollPaneName, Component addScroolToPane, Color BackgroundColor) {
        scrollPaneName = new JScrollPane(addScroolToPane);
		scrollPaneName.setBackground(BackgroundColor);
        return scrollPaneName;
    }

    public static JToolBar horizontalToolBar(JToolBar toolBarName, Color BackgroundColor) {
        toolBarName = new JToolBar(JToolBar.HORIZONTAL);
        toolBarName.setBackground(BackgroundColor);
        return toolBarName;
    }

    public static JToolBar verticalToolBar(JToolBar toolBarName, Color BackgroundColor) {
        toolBarName = new JToolBar(JToolBar.VERTICAL);
        toolBarName.setBackground(BackgroundColor);
        return toolBarName;
    }
}