/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmBarang.java
 *
 * Created on Feb 8, 2010, 1:36:14 PM
 */

package com.salon.ui.form;

import com.salon.launcher.Main;
import com.salon.util.MyStripRenderer;
import com.salon.util.formSystematization;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class frmBarang extends javax.swing.JInternalFrame {

    /** Creates new form frmBarang */
    public frmBarang() {
        initComponents();

        initData();

        
    }

    Statement stmBarang;
    PreparedStatement stmUpdateBarang;
    PreparedStatement stmDeleteBarang;
    ResultSet rsBarang;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Data Barang");

        tabelBarang.setFont(new java.awt.Font("Courier New", 0, 13));
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelBarang.setRowHeight(20);
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        tabelBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelBarangKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(tabelBarang);

        jButton1.setText("Entri Data Barang");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked

}//GEN-LAST:event_tabelBarangMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmEntriBarang entri = new frmEntriBarang(new Frame(), true);
        entri.show();
        try {
            Select_Barang();
        } catch (SQLException ex) {
            Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelBarangKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DELETE) {
            int result = JOptionPane.showConfirmDialog(rootPane, "Peringatan!! Data akan dihapus secara permanen, anda yakin akan menghapus?",
                "Konfirmasi hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (result==JOptionPane.NO_OPTION) {
                return;
            }

            try {
                Delete_Barang();
                Select_Barang();
            } catch (SQLException ex) {
                Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex, "Error : Delete", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
            }
        }
        formSystematization.nextfocus(evt);
    }//GEN-LAST:event_tabelBarangKeyPressed

    void initData () {
        try {
            stmBarang = Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            init_PreparedStatement();

            Select_Barang();
        } catch (SQLException ex) {
            Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex, "Error : Select Data", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void init_PreparedStatement () throws SQLException {
        stmDeleteBarang=Main.data.getActiveConnection().prepareStatement("DELETE FROM BARANG WHERE BARANGID=?");
    }
    
     void Select_Barang () throws SQLException, Exception {
        rsBarang=stmBarang.executeQuery("SELECT BARANGID, NAMABARANG, QTYPERUNIT, HARGAJUAL, REORDERSTATUS, KONTROLSTOK " +
                "FROM BARANG()");

        DefaultTableModel model = new DefaultTableModel() {

            Class[] type = new Class [] {
                Object.class, Object.class, Object.class, Object.class, Boolean.class, Boolean.class
            };

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return type [columnIndex];
            }



            @Override
            public void fireTableCellUpdated(int row, int column) {
                super.fireTableCellUpdated(row, column);
                if (tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 0)!=null) {
                    String  sqlQuery="";

                    sqlQuery="UPDATE BARANG SET " +
                            tabelBarang.getColumnName(tabelBarang.getSelectedColumn()) + "=? " +
                            "WHERE BARANGID='" + tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 0) + "'";

                    try {

                        stmUpdateBarang = Main.data.getActiveConnection().prepareStatement(sqlQuery);
                        Object newVal;
                        newVal=tabelBarang.getValueAt(row, column);
                        switch (column) {
                            case 3 :
                                newVal=Integer.valueOf(newVal.toString());
                                break;
                        }
                        
                        stmUpdateBarang.setObject(1, newVal);
                        stmUpdateBarang.execute();

                        Select_Barang();
                    } catch (SQLException ex) {
                        Logger.getLogger(frmEntriTransaksi.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : Update", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        Logger.getLogger(frmEntriTransaksi.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : Update", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }

        };

        Main.data.JTableFill(tabelBarang, rsBarang, model);        
        TableCellRenderer renderer = new MyStripRenderer(Color.BLACK, new Color(238,239,255));
        tabelBarang.setDefaultRenderer(Object.class, renderer);
     }

    void Update_Barang () throws SQLException {
        stmUpdateBarang.setObject(1, tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 0));
        stmUpdateBarang.setObject(2, tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 1));
        stmUpdateBarang.setObject(3, tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 2));
        stmUpdateBarang.setObject(4, tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 3));
        stmUpdateBarang.setObject(5, tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 4));

        stmUpdateBarang.execute();
    }

    void Delete_Barang () throws SQLException {
        stmDeleteBarang.setObject(1, tabelBarang.getValueAt(tabelBarang.getSelectedRow(), 0));

        stmDeleteBarang.execute();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tabelBarang;
    // End of variables declaration//GEN-END:variables

}
