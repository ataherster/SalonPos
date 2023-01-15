package com.salon.util;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Ahmad Thahir <ataherster at yahoo.co.id>
 */
public class MyDefaultCellEditor extends DefaultCellEditor {

    /**
     * 
     * @param button
     */
    public MyDefaultCellEditor (final JButton button) {
        super (new JTextField());
        editorComponent = button;
	this.clickCountToStart = 1;
    }

    public MyDefaultCellEditor (final JDateChooser jdateChooser) {
        super (new JTextField());
        editorComponent = jdateChooser;
        delegate = new EditorDelegate () {

            @Override
            public void setValue(Object value) {
                if (value==null) return;
                jdateChooser.setDate(Date.valueOf(value.toString()));
            }
            
            @Override
            public Object getCellEditorValue() {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                return Date.valueOf(df.format(jdateChooser.getDate()));
            }
        };
	this.clickCountToStart = 1;
    }

}
