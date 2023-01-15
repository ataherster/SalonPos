package com.salon.util;


import java.text.NumberFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class CurrencyRenderer extends DefaultTableCellRenderer {
    
    public CurrencyRenderer() {
        super();
        setHorizontalAlignment(SwingConstants.RIGHT);
    }

    @Override
    public void setValue(Object value) {
        if ((value != null) && (value instanceof Number)) {
            Number numberValue = (Number) value;
            NumberFormat formatter = NumberFormat.getNumberInstance();
            value = formatter.format(numberValue.doubleValue());
        }
        super.setValue(value);
    }
}
