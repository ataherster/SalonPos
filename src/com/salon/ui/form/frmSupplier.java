/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmSupplier.java
 *
 * Created on Feb 9, 2010, 5:00:26 PM
 */

package com.salon.ui.form;

import com.salon.launcher.Main;
import com.salon.util.MyStripRenderer;
import com.salon.util.formSystematization;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class frmSupplier extends javax.swing.JInternalFrame {

    /** Creates new form frmSupplier */
    public frmSupplier() {

        initComponents();

        initData();
    }

    Statement stmSupplier;
    PreparedStatement stmUpdateSupplier;
    PreparedStatement stmDeleteSupplier;
    ResultSet rsSupplier;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane9 = new javax.swing.JScrollPane();
        tabelSupplier = new javax.swing.JTable();
        btnEntri = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Data Supplier");

        tabelSupplier.setFont(new java.awt.Font("Courier New", 0, 13));
        tabelSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelSupplier.setRowHeight(20);
        tabelSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSupplierMouseClicked(evt);
            }
        });
        tabelSupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelSupplierKeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(tabelSupplier);

        btnEntri.setText("Entri Data Supplier");
        btnEntri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addComponent(btnEntri))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSupplierMouseClicked

}//GEN-LAST:event_tabelSupplierMouseClicked

    private void tabelSupplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelSupplierKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DELETE) {
            int result = JOptionPane.showConfirmDialog(rootPane, "Peringatan!! Data akan dihapus secara permanen, anda yakin akan menghapus?",
                "Konfirmasi hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (result==JOptionPane.NO_OPTION) {
                return;
            }

            try {
                Delete_Supplier();
                Select_Supplier();
            } catch (SQLException ex) {
                Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex, "Error : Delete", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(frmBarang.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
            }
        }
        formSystematization.nextfocus(evt);
    }//GEN-LAST:event_tabelSupplierKeyPressed

    private void btnEntriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntriActionPerformed
        frmEntriSupplier entri = new frmEntriSupplier(new Frame(), true);
        entri.show();
        try {
            Select_Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(frmSupplier.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(frmSupplier.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntriActionPerformed

    void initData () {
        try {
            stmSupplier = Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            init_PreparedStatement();

            Select_Supplier();
        } catch (SQLException ex) {
            Logger.getLogger(frmSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(frmSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void init_PreparedStatement () throws SQLException {
        stmDeleteSupplier=Main.data.getActiveConnection().prepareStatement("DELETE FROM SUPPLIER WHERE SUPPLIERID=?");
    }

    void Select_Supplier () throws SQLException, Exception {
        rsSupplier=stmSupplier.executeQuery("SELECT * FROM SUPPLIER ORDER BY SUPPLIERID");

        DefaultTableModel model = new DefaultTableModel() {

            @Override
            public void fireTableCellUpdated(int row, int column) {
                super.fireTableCellUpdated(row, column);
                if (tabelSupplier.getValueAt(tabelSupplier.getSelectedRow(), 0)!=null) {
                    String  sqlQuery="";

                    sqlQuery="UPDATE SUPPLIER SET " +
                            tabelSupplier.getColumnName(tabelSupplier.getSelectedColumn()) + "=? " +
                            "WHERE SUPPLIERID=" + tabelSupplier.getValueAt(tabelSupplier.getSelectedRow(), 0);

                    try {

                        stmUpdateSupplier = Main.data.getActiveConnection().prepareStatement(sqlQuery);
                        stmUpdateSupplier.setObject(1, tabelSupplier.getValueAt(tabelSupplier.getSelectedRow(), tabelSupplier.getSelectedColumn()));
                        stmUpdateSupplier.execute();

                        Select_Supplier();
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

        Main.data.JTableFill(tabelSupplier, rsSupplier, model);
        TableCellRenderer renderer = new MyStripRenderer(Color.BLACK, new Color(238,239,255));
        tabelSupplier.setDefaultRenderer(Object.class, renderer);
    }

    void Delete_Supplier () throws SQLException {
        stmDeleteSupplier.setObject(1, tabelSupplier.getValueAt(tabelSupplier.getSelectedRow(), 0));
        
        stmDeleteSupplier.execute();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntri;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tabelSupplier;
    // End of variables declaration//GEN-END:variables

}
