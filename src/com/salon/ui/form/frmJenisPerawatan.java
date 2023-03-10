/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmKaryawan.java
 *
 * Created on 04-Feb-2009, 10:54:45
 */

package com.salon.ui.form;

import com.salon.launcher.Main;
import com.salon.util.MyStripRenderer;
import com.salon.util.NumberRenderer;
import com.salon.util.formSystematization;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author SAK
 */
public class frmJenisPerawatan extends javax.swing.JInternalFrame {

    /** Creates new form frmKaryawan */
    public frmJenisPerawatan() {
        initComponents();
        initData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabJenisPerawatan = new javax.swing.JTabbedPane();
        panelPerawatan = new javax.swing.JPanel();
        ScrollTabelKaryawan = new javax.swing.JScrollPane();
        tabelPerawatan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelJenisPerawatan = new javax.swing.JPanel();
        ScrollTabelKaryawan1 = new javax.swing.JScrollPane();
        tabelJenisPerawatan = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Jenis Perawatan");

        ScrollTabelKaryawan.setBackground(new java.awt.Color(204, 204, 204));

        tabelPerawatan.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        tabelPerawatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelPerawatan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelPerawatan.setRowHeight(20);
        tabelPerawatan.getTableHeader().setReorderingAllowed(false);
        tabelPerawatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPerawatanMouseClicked(evt);
            }
        });
        tabelPerawatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelPerawatanKeyPressed(evt);
            }
        });
        ScrollTabelKaryawan.setViewportView(tabelPerawatan);

        jLabel1.setText("<html>* Persen untuk Stylish disini akan menjadi prioritas utama, jika bernilai 0, makan persen tetap Stylish yang akan dipakai pada transaksi dan sebaliknya</html> ");

        javax.swing.GroupLayout panelPerawatanLayout = new javax.swing.GroupLayout(panelPerawatan);
        panelPerawatan.setLayout(panelPerawatanLayout);
        panelPerawatanLayout.setHorizontalGroup(
            panelPerawatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerawatanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPerawatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollTabelKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelPerawatanLayout.setVerticalGroup(
            panelPerawatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerawatanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollTabelKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabJenisPerawatan.addTab("Perawatan", panelPerawatan);

        ScrollTabelKaryawan1.setBackground(new java.awt.Color(204, 204, 204));

        tabelJenisPerawatan.setFont(new java.awt.Font("Courier New", 0, 13));
        tabelJenisPerawatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelJenisPerawatan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelJenisPerawatan.setRowHeight(20);
        tabelJenisPerawatan.getTableHeader().setReorderingAllowed(false);
        tabelJenisPerawatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelJenisPerawatanMouseClicked(evt);
            }
        });
        tabelJenisPerawatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelJenisPerawatanKeyPressed(evt);
            }
        });
        ScrollTabelKaryawan1.setViewportView(tabelJenisPerawatan);

        javax.swing.GroupLayout panelJenisPerawatanLayout = new javax.swing.GroupLayout(panelJenisPerawatan);
        panelJenisPerawatan.setLayout(panelJenisPerawatanLayout);
        panelJenisPerawatanLayout.setHorizontalGroup(
            panelJenisPerawatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJenisPerawatanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollTabelKaryawan1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelJenisPerawatanLayout.setVerticalGroup(
            panelJenisPerawatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJenisPerawatanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollTabelKaryawan1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabJenisPerawatan.addTab("Jenis Perawatan", panelJenisPerawatan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabJenisPerawatan, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabJenisPerawatan, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabJenisPerawatan.getAccessibleContext().setAccessibleName("tabKaryawan");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelPerawatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPerawatanMouseClicked

}//GEN-LAST:event_tabelPerawatanMouseClicked

    private void tabelJenisPerawatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelJenisPerawatanMouseClicked

}//GEN-LAST:event_tabelJenisPerawatanMouseClicked

    private void tabelPerawatanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelPerawatanKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DELETE) {
            int result=JOptionPane.showConfirmDialog(rootPane, "anda yakin akan menghapus daftar Perawatan dengan id : " +
                    tabelPerawatan.getValueAt(tabelPerawatan.getSelectedRow(), 0)+ " ?","Konfrimasi Hapus Data", JOptionPane.YES_NO_OPTION);
            if (result==JOptionPane.YES_OPTION) {
                try {
                    Delete_Perawatan();
                    Select_Perawatan();
                } catch (SQLException ex) {
                    Logger.getLogger(frmTransaksiPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, ex, "Error : Delete", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    Logger.getLogger(frmTransaksiPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, ex, "Error : Select_BukuTamu()", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        formSystematization.nextfocus(evt);
    }//GEN-LAST:event_tabelPerawatanKeyPressed

    private void tabelJenisPerawatanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelJenisPerawatanKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DELETE) {
            int result=JOptionPane.showConfirmDialog(rootPane, "anda yakin akan menghapus daftar Jenis Perawatan dengan id : " +
                    tabelJenisPerawatan.getValueAt(tabelJenisPerawatan.getSelectedRow(), 0)+ " ?","Konfrimasi Hapus Data", JOptionPane.YES_NO_OPTION);
            if (result==JOptionPane.YES_OPTION) {
                try {
                    Delete_JenisPerawatan();
                    Select_JenisPerawatan();
                } catch (SQLException ex) {
                    Logger.getLogger(frmTransaksiPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, ex, "Error : Delete", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    Logger.getLogger(frmTransaksiPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, ex, "Error : Select_BukuTamu()", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        formSystematization.nextfocus(evt);
    }//GEN-LAST:event_tabelJenisPerawatanKeyPressed

    Statement stmPerawatan;
    ResultSet rsPerawatan;
    PreparedStatement stmInsertPerawatan;
    PreparedStatement stmUpdatePerawatan;
    PreparedStatement stmDeletePerawatan;

    Statement stmJenisPerawatan;
    ResultSet rsJenisPerawatan;
    PreparedStatement stmInsertJenisPerawatan;
    PreparedStatement stmUpdateJenisPerawatan;
    PreparedStatement stmDeleteJenisPerawatan;

    Statement stmGetData;
    ResultSet rsGetData;

    void initData (){

        tabelPerawatan.setAutoCreateRowSorter(true);

        try {
            stmPerawatan=Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmJenisPerawatan=Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmGetData=Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            Select_Perawatan();
            Select_JenisPerawatan();
            init_PreparedStatement();
          } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex, "Error : initData", JOptionPane.ERROR_MESSAGE);
        }

    }

    void init_PreparedStatement () throws SQLException {
        stmInsertPerawatan=Main.data.getActiveConnection().prepareStatement("SELECT INSERT_PERAWATAN (?,?,?,?,?)");
        stmUpdatePerawatan=Main.data.getActiveConnection().prepareCall("SELECT UPDATE_PERAWATAN (?,?,?,?::real,?)");
        stmDeletePerawatan=Main.data.getActiveConnection().prepareCall("DELETE FROM PERAWATAN WHERE KODEPERAWATAN=?");

        stmInsertJenisPerawatan=Main.data.getActiveConnection().prepareStatement("SELECT INSERT_JENISPERAWATAN (?)");
        stmUpdateJenisPerawatan=Main.data.getActiveConnection().prepareStatement("SELECT UPDATE_JENISPERAWATAN (?,?)");
        stmDeleteJenisPerawatan=Main.data.getActiveConnection().prepareStatement("DELETE FROM JENISPERAWATAN WHERE KODEJENISPERAWATAN=?");
    }

    void Select_Perawatan () throws SQLException, Exception {
        rsPerawatan=stmPerawatan.executeQuery(
                "SELECT KODEPERAWATAN AS KODE, DESKRIPSI, NAMAPERAWATAN, " +
                "HARGAPERAWATAN, DISCOUNT, STATUSAKTIF FROM PERAWATAN INNER JOIN JENISPERAWATAN USING(KODEJENISPERAWATAN)" +
                "ORDER BY KODEPERAWATAN");

        DefaultTableModel model = new DefaultTableModel() {

            @Override
            public void fireTableCellUpdated(int row, int column) {
                super.fireTableCellUpdated(row, column);

                if (tabelPerawatan.getValueAt(row, 0)==null && tabelPerawatan.getValueAt(row, 1)!=null) {
                    try {
                        Insert_Perawatan();
                        Select_Perawatan();
                    } catch (SQLException ex) {
                        Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : Insert", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : select", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (tabelPerawatan.getValueAt(row, 0)!=null) {
                    String sqlQuery="";

                    switch (column) {
                        case 1 :
                            try {
                                rsGetData = stmGetData.executeQuery("SELECT KODEJENISPERAWATAN FROM JENISPERAWATAN WHERE DESKRIPSI='" +
                                        tabelPerawatan.getValueAt(row, column) + "'");
                                rsGetData.next();
                                
                                sqlQuery="UPDATE PERAWATAN SET KODEJENISPERAWATAN=" + rsGetData.getObject(1) + " " +
                                        "WHERE KODEPERAWATAN=" + tabelPerawatan.getValueAt(row, 0);
                                stmUpdatePerawatan = Main.data.getActiveConnection().prepareStatement(sqlQuery);
                            } catch (SQLException ex) {
                                Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
                            }
                            break;

                        case 3 :
                        case 4 :
                        case 5:
                            sqlQuery="UPDATE PERAWATAN SET " +
                                    tabelPerawatan.getColumnName(column) + "=" +
                                    tabelPerawatan.getValueAt(row, column) + " " +
                                    "WHERE KODEPERAWATAN=" + tabelPerawatan.getValueAt(row, 0);
                            try {
                                stmUpdatePerawatan = Main.data.getActiveConnection().prepareStatement(sqlQuery);
                            } catch (SQLException ex) {
                                Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        default :
                            sqlQuery="UPDATE PERAWATAN SET " +
                                    tabelPerawatan.getColumnName(column) + "=? " +
                                    "WHERE KODEPERAWATAN=" + tabelPerawatan.getValueAt(row, 0);
                            try {
                                stmUpdatePerawatan = Main.data.getActiveConnection().prepareStatement(sqlQuery);
                                stmUpdatePerawatan.setObject(1, tabelPerawatan.getValueAt(row, column));
                            } catch (SQLException ex) {
                                Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
                            }
                    }
                    
                    try {                        
                        stmUpdatePerawatan.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : Update", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
            }

            Class[] type = new Class[] {
                Number.class, Object.class, Object.class, Object.class, Object.class, Boolean.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return type [columnIndex];
            }

        };

        Main.data.JTableFill(tabelPerawatan, rsPerawatan, model);

        tabelPerawatan.getColumnModel().getColumn(3).setCellRenderer(new NumberRenderer());
        tabelPerawatan.getColumnModel().getColumn(4).setCellRenderer(new NumberRenderer());

        //Menambah Record kosong ke data TabelPerawatan;
        model.addRow(new Object[] {});

        //Insert list Jenis Perawatan kedalam comboBox dan mengubah
        //Cell Editor Jenis Perawatan menjadi ComboBox
        JComboBox cboJenisPerawatan = new JComboBox();
        rsGetData = stmGetData.executeQuery("SELECT DESKRIPSI FROM JENISPERAWATAN");
        Main.data.JComboFill(cboJenisPerawatan, rsGetData);
        tabelPerawatan.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(cboJenisPerawatan));
        
        TableCellRenderer renderer = new MyStripRenderer(Color.BLACK, new Color(238,239,255));
        tabelPerawatan.setDefaultRenderer(Object.class, renderer);
    }

    void Insert_Perawatan () throws SQLException {

        rsGetData=stmGetData.executeQuery("SELECT KODEJENISPERAWATAN FROM JENISPERAWATAN WHERE DESKRIPSI='" +
                                tabelPerawatan.getValueAt(tabelPerawatan.getSelectedRow(), tabelPerawatan.getSelectedColumn()) + "'");
                        rsGetData.next();

        stmInsertPerawatan.setObject(1, rsGetData.getObject(1));
        stmInsertPerawatan.setObject(2, "");
        stmInsertPerawatan.setObject(3, 0);
        stmInsertPerawatan.setObject(4, 0);
        stmInsertPerawatan.setObject(5, true);

        stmInsertPerawatan.execute();
    }
    
    void Delete_Perawatan () throws SQLException {
        stmDeletePerawatan.setObject(1, tabelPerawatan.getValueAt(tabelPerawatan.getSelectedRow(), 0));
        stmDeletePerawatan.execute();
    }
    void Select_JenisPerawatan () throws SQLException, Exception {
        rsJenisPerawatan=stmJenisPerawatan.executeQuery("SELECT KODEJENISPERAWATAN AS ID, DESKRIPSI FROM JENISPERAWATAN " +
                "ORDER BY DESKRIPSI");

        DefaultTableModel model = new DefaultTableModel(){

            @Override
            public void fireTableCellUpdated(int row, int column) {
                super.fireTableCellUpdated(row, column);
                
                if (tabelJenisPerawatan.getValueAt(row, 0)==null && tabelJenisPerawatan.getValueAt(row, 1)!=null) {
                    try {
                        Insert_JenisPerawatan();
                        Select_JenisPerawatan();
                    } catch (SQLException ex) {
                        Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : Insert", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : Select", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else if (tabelJenisPerawatan.getValueAt(row, column)!=null) {
                    String sqlQuery="";
                    sqlQuery="UPDATE JENISPERAWATAN SET " +
                            tabelJenisPerawatan.getColumnName(column) + "='" +
                            tabelJenisPerawatan.getValueAt(row, column) + "' " +
                            "WHERE KODEJENISPERAWATAN=" +
                            tabelJenisPerawatan.getValueAt(row, 0);
                    try {
                        stmUpdateJenisPerawatan = Main.data.getActiveConnection().prepareStatement(sqlQuery);
                        stmUpdateJenisPerawatan.execute();

                    } catch (SQLException ex) {
                        Logger.getLogger(frmJenisPerawatan.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "Error : Update", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }

            
        };

        Main.data.JTableFill(tabelJenisPerawatan, rsJenisPerawatan, model);
        //menambahkan record kosong untuk memasukkan data baru
        model.addRow(new Object[] {});
        
        TableCellRenderer renderer = new MyStripRenderer(Color.BLACK, new Color(238,239,255));
        tabelJenisPerawatan.setDefaultRenderer(Object.class, renderer);
    }

    void Insert_JenisPerawatan () throws SQLException {
        stmInsertJenisPerawatan.setObject(1, tabelJenisPerawatan.getValueAt(tabelJenisPerawatan.getSelectedRow(), 1));
        stmInsertJenisPerawatan.execute();
    }

    void Delete_JenisPerawatan () throws SQLException {
        stmDeleteJenisPerawatan.setObject(1, tabelJenisPerawatan.getValueAt(tabelJenisPerawatan.getSelectedRow(), 0));
        stmDeleteJenisPerawatan.execute();
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTabelKaryawan;
    private javax.swing.JScrollPane ScrollTabelKaryawan1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelJenisPerawatan;
    private javax.swing.JPanel panelPerawatan;
    private javax.swing.JTabbedPane tabJenisPerawatan;
    private javax.swing.JTable tabelJenisPerawatan;
    private javax.swing.JTable tabelPerawatan;
    // End of variables declaration//GEN-END:variables

}
