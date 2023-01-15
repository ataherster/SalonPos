/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.salon.util;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.*;


/**
 *
 * @author SAK
 */
public class MyData {
    
    private Connection ActiveConnection = null;
    private String ClassName;
    private String dbServer;
    private String UserName;
    private String Password;

    /**
     * Method <code> setActiveConnection</code> untuk menentukan nilai dari variable 
     * ActiveConnection syang bertype Connection
     * <p>
     * 
     * @param ActiveConnection
     */
    public void setActiveConnection(Connection ActiveConnection) {
        this.ActiveConnection = ActiveConnection;
    }

    /**
     * Mengembalikan nilai dari Variable <code>ActiveConnection</code>
     * @return ActiveConnection
     */
    public Connection getActiveConnection() {
        return ActiveConnection;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setDbServer(String dbServer) {
        this.dbServer = dbServer;
    }

    public String getDbServer() {
        return dbServer;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void getConnection () throws SQLException, ClassNotFoundException{
        Class.forName(getClassName());
        ActiveConnection = DriverManager.getConnection(getDbServer(), getUserName(), Password);
        ActiveConnection.setAutoCommit(true);

    }

    public Boolean verifikasiUser (String username, String password) {
        if (UserName.equals(username) && Password.equals(password)) {
            return true;
        }else {
            return false;
        }
    }

    public void commit () throws SQLException {
        ActiveConnection.commit();
    }

    public void roolback () throws SQLException {
        ActiveConnection.rollback();
    }

    /**
     * Memasukkan data ke dalam <code>JTable</code> dari hasil <code>ResultSet</code>
     * 
     *
     * @param table
     * @param rs
     * @throws Exception
     */

    public void JTableFill (JTable table, ResultSet rs, DefaultTableModel model) throws Exception {
        String columnData[] = new String[rs.getMetaData().getColumnCount()];
        rs.last();
        Object rowData[][] = new Object[rs.getRow()][rs.getMetaData().getColumnCount()];
        for (int i=0;i < rs.getMetaData().getColumnCount();i++) {
            columnData[i]=rs.getMetaData().getColumnName(i+1);
        }
        rs.beforeFirst();
        while (rs.next()) {
            for (int i=0;i < rs.getMetaData().getColumnCount();i++) {
                rowData[rs.getRow()-1][i]=rs.getObject(i+1);
            }
        }

        model.setDataVector(rowData, columnData);

        table.setModel(model);
        autoResizeColWidth(table);
    }

    public void JTableFill (JTable table, ResultSet rs) throws Exception {
        JTableFill(table, rs, new DefaultTableModel());
    }

    public void JComboFill (JComboBox combo, ResultSet rs) throws SQLException {
        rs.beforeFirst();
        while (rs.next()) {
            combo.addItem(rs.getObject(1));
        }
    }

    public JTable autoResizeColWidth(JTable table) {
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        int margin = 5;

        for (int i = 0; i < table.getColumnCount(); i++) {
            int                     vColIndex = i;
            DefaultTableColumnModel colModel  = (DefaultTableColumnModel) table.getColumnModel();
            TableColumn             col       = colModel.getColumn(vColIndex);
            int                     width     = 0;

            // Get width of column header
            TableCellRenderer renderer = col.getHeaderRenderer();

            if (renderer == null) {
                renderer = table.getTableHeader().getDefaultRenderer();
            }

            Component comp = renderer.getTableCellRendererComponent(table, col.getHeaderValue(), false, false, 0, 0);

            width = comp.getPreferredSize().width;

            // Get maximum width of column data
            for (int r = 0; r < table.getRowCount(); r++) {
                renderer = table.getCellRenderer(r, vColIndex);
                comp     = renderer.getTableCellRendererComponent(table, table.getValueAt(r, vColIndex), false, false,
                        r, vColIndex);
                width = Math.max(width, comp.getPreferredSize().width);
            }

            // Add margin
            width += 2 * margin;

            // Set the width
            col.setPreferredWidth(width);
        }

        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(
            SwingConstants.LEFT);

        // table.setAutoCreateRowSorter(true);
        table.getTableHeader().setReorderingAllowed(false);

        return table;
    }

    public static void setDateCombo (JComboBox Tanggal, JComboBox Bulan, JComboBox Tahun) {
        Tanggal.addItem("Tgl");
        Bulan.addItem("Bln");
        Tahun.addItem("Thn");
        for (int i=1; i <= 31;i++) {
            if (i<10) {
                Tanggal.addItem("0" + i);
            }else {
                Tanggal.addItem("" + i);
            }
        }
        for (int i=1; i <= 12;i++) {
            if (i<10) {
                Bulan.addItem("0" + i);
            } else {
                Bulan.addItem("" + i);
            }
        }
        for (int i=1960; i <= 3000;i++) {
            Tahun.addItem("" + i);
        }
    }

    public static String setDateString (JComboBox Tanggal, JComboBox Bulan, JComboBox Tahun) {
        return Tahun.getSelectedItem().toString() + "-"  + Bulan.getSelectedItem().toString()
                + "-" + Tanggal.getSelectedItem().toString();
    }

    public static Object getDateFromString (String stringDate) {
        return stringDate.substring(8, 10);
    }

    public static Object getMonthFromString (String stringDate) {
        return stringDate.substring(5, 7);
    }

    public static Object getYearFromString (String stringDate) {
        return stringDate.substring(0, 4);
    }

    public static void ReadIniFile(String file) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream(file));
    }
}
