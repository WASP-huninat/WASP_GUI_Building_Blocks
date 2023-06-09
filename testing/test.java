package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import wasp.gui.building.container;
import wasp.gui.building.menus;
import wasp.gui.building.window;

public class test {

    private static  JFrame win;
    private static JPanel panel;

    public static void main(String[] args) {
    win = window.centeredFrame(win, "Test Window", 500, 300, null);
    panel = container.panel(panel, Color.lightGray, null);
    }
}