/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmEditInfo.java
 *
 * Created on Mar 4, 2010, 7:35:12 AM
 */

package com.salon.ui.form;

import com.salon.launcher.Main;
import com.salon.util.MyStripRenderer;
import com.salon.util.NumberRenderer;
import com.salon.util.formSystematization;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class frmSetting extends javax.swing.JDialog {

    /** Creates new form frmEditInfo */
    public frmSetting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Init_Data();

        formSystematization.CenterScreen(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelSettings = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tabelSettings.setFont(new java.awt.Font("Courier New", 0, 12));
        tabelSettings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelSettings.setRowHeight(20);
        tabelSettings.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelSettingsKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabelSettings);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(btnKembali))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tabelSettingsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelSettingsKeyPressed
        
    }//GEN-LAST:event_tabelSettingsKeyPressed

    void Init_Data () {
        try {
            stmGetData=Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            Select_Settings();
        } catch (SQLException ex) {
            Logger.getLogger(frmSetting.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex, "err : init Prepared Statement", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            
        }
    }

    void Select_Settings () throws SQLException, Exception {
        rsGetData=stmGetData.executeQuery("SELECT * FROM settings Order By setid");
        
        DefaultTableModel model = new DefaultTableModel() {

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex==0) {
                    return Number.class;
                }
                return super.getColumnClass(columnIndex);
            }

            
            @Override
            public void fireTableCellUpdated(int row, int column) {
                super.fireTableCellUpdated(row, column);
                if (tabelSettings.getValueAt(row, 0)!=null) {
                    String  sqlQuery="";
                    sqlQuery="UPDATE settings SET " +
                            tabelSettings.getColumnName(tabelSettings.getSelectedColumn()) + "=? " +
                            "WHERE setid='" + tabelSettings.getValueAt(row, 0) + "'";
                    
                    try {
                        
                        stmUpdateSetting = Main.data.getActiveConnection().prepareStatement(sqlQuery);
                        switch (column) {
                            case 2 :
                            case 3 :
                                stmUpdateSetting.setObject(1,  Integer.parseInt(tabelSettings.getValueAt(row, column).toString()));
                                break;
                            default :
                                stmUpdateSetting.setObject(1, tabelSettings.getValueAt(row, column));
                                break;
                                
                        }
                        
                        stmUpdateSetting.execute();

                        Select_Settings();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, ex, "Error : Update", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, ex, "Error : Update", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }

        };
        
        Main.data.JTableFill(tabelSettings, rsGetData, model);
        TableCellRenderer renderer = new MyStripRenderer(Color.BLACK, new Color(238,239,255));
        tabelSettings.setDefaultRenderer(Object.class, renderer);
        
        tabelSettings.getColumnModel().getColumn(2).setCellRenderer(new NumberRenderer());
    }
    
    
    Statement stmGetData;
    ResultSet rsGetData;
    PreparedStatement stmUpdateSetting;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tabelSettings;
    // End of variables declaration//GEN-END:variables

}
