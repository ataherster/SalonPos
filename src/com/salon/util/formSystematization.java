/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.salon.util;

import com.salon.launcher.Main;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Class formSystematization menyimpan beberapa Method Static untuk keperluan Style
 * antara lain JFrame dan JDialog
 * @author Ahmad Thahir
 */
public class formSystematization {
    
    public static void MyStyle (JFrame frm, String classname){
        try {
            UIManager.setLookAndFeel(classname);
            SwingUtilities.updateComponentTreeUI(frm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void MyStyle (JDialog frm, String classname){
        try {
            UIManager.setLookAndFeel(classname);
            SwingUtilities.updateComponentTreeUI(frm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void CenterScreen(JFrame frm) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension ScreenSize = toolkit.getScreenSize();

        int x = (ScreenSize.width - frm.getWidth()) / 2;
        int y = (ScreenSize.height - frm.getHeight()) / 2;

        frm.setLocation(x, y);
    }

    public static void CenterScreen(JDialog frm) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension ScreenSize = toolkit.getScreenSize();

        int x = (ScreenSize.width - frm.getWidth()) / 2;
        int y = (ScreenSize.height - frm.getHeight()) / 2;

        frm.setLocation(x, y);
    }

    public static void CenterScreen(JInternalFrame frm) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension ScreenSize = toolkit.getScreenSize();

        int x = (ScreenSize.width - frm.getWidth()) / 2;
        int y = (ScreenSize.height - frm.getHeight()) / 2;

        frm.setLocation(x, y);
    }

    public static void nextfocus (KeyEvent evt) {
        try {
            int key = evt.getKeyCode();
            if (key==KeyEvent.VK_ENTER) {
                evt.consume();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_TAB);
            }
        } catch (AWTException ex) {
            JOptionPane.showMessageDialog(new Panel(), ex);
        }
    }
}
