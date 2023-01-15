package com.salon.util;


import java.text.NumberFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class NumberRenderer extends DefaultTableCellRenderer {
    
    public NumberRenderer() {
        super();
        setHorizontalAlignment(SwingConstants.RIGHT);
    }

    @Override
    public void setValue(Object value) {
        if ((value != null) && (value instanceof Number)) {
            Number numberValue = (Number) value;
            NumberFormat formatter = NumberFormat.getIntegerInstance();
            value = formatter.format(numberValue.intValue());
        }
        super.setValue(value);
    }
}
