package wasp.gui.building;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class window {

    public static JFrame frame(JFrame frameName, String windowTitle, int windowWidth, int windowHight, int xPosition, int yPosition, Color BackgroundColor) {
        frameName = new JFrame(windowTitle);
        frameName.setBackground(BackgroundColor);
        frameName.setBounds(xPosition, yPosition, windowWidth, windowHight);
        frameName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameName.setVisible(true);
        return frameName;
    }
    
    public static JFrame centeredFrame(JFrame frameName, String windowTitle, int windowWidth, int windowHight, Color BackgroundColor) {
        frameName = new JFrame(windowTitle);
        frameName.setSize(windowWidth, windowHight);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frameName.setLocation((dim.width-windowWidth)/2, (dim.height-windowHight)/2);
        frameName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameName.setVisible(true);
        return frameName;
    }

    public static JDialog dialog(JDialog dialogName, String dialogTitle, int windowWidth, int windowHight, int xPosition, int yPosition, boolean isModal) {
        dialogName = new JDialog();
        dialogName.setTitle(dialogTitle);
        dialogName.setSize(windowWidth, windowHight);
        dialogName.setModal(isModal);
        dialogName.setVisible(true);
        return dialogName;
    }
}