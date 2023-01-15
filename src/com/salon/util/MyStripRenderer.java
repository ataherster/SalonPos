/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.salon.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author SAK
 */
public class MyStripRenderer extends DefaultTableCellRenderer {

    public MyStripRenderer() {
    }
    public MyStripRenderer(Color foregroundStripTwo, Color backgroundStripTwo) {
        this.foregroundStripTwo=foregroundStripTwo;
        this.backgroundStripTwo=backgroundStripTwo;
    }

    public MyStripRenderer(Color foregroundStripOne,
            Color backgroundStripOne, Color foregroundStripTwo, Color backgroundStripTwo) {
        this.foregroundStripOne=foregroundStripOne;
        this.backgroundStripOne=backgroundStripOne;
        this.foregroundStripTwo=foregroundStripTwo;
        this.backgroundStripTwo=backgroundStripTwo;
    }
    public MyStripRenderer(Color foregroundSelected,Color backgroundSelected ,Color foregroundStripOne,
            Color backgroundStripOne, Color foregroundStripTwo, Color backgroundStripTwo) {
        this.foregroundSelected=foregroundSelected;
        this.backgroundSelected=backgroundSelected;
        this.foregroundStripOne=foregroundStripOne;
        this.backgroundStripOne=backgroundStripOne;
        this.foregroundStripTwo=foregroundStripTwo;
        this.backgroundStripTwo=backgroundStripTwo;

    }
    Color foregroundSelected=Color.WHITE;
    Color backgroundSelected=new Color(49, 106, 197);
    Color foregroundStripOne=Color.BLACK;
    Color backgroundStripOne=Color.WHITE;
    Color foregroundStripTwo=Color.BLACK;
    Color backgroundStripTwo=Color.WHITE;

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    ((JLabel) renderer).setOpaque(true);
    Color foreground, background;
    if (isSelected) {
      foreground = foregroundSelected;
      background = backgroundSelected;
    } else {
        if (row % 2 == 0) {
            foreground = foregroundStripOne;
            background = backgroundStripOne;
          } else {
            foreground = foregroundStripTwo;
            background = backgroundStripTwo;
          }
    }
    renderer.setForeground(foreground);
    renderer.setBackground(background);
    return renderer;
    }
}
