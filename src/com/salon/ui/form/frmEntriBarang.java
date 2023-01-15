/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmEntriKaryawan.java
 *
 * Created on Jan 30, 2010, 10:50:46 AM
 */

package com.salon.ui.form;

import com.salon.launcher.Main;
import com.salon.util.MyData;
import com.salon.util.formSystematization;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author User
 */
public class frmEntriBarang extends javax.swing.JDialog {

    /** Creates new form frmEntriKaryawan */
    public frmEntriBarang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initData();

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

        txtHargaJual = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBarangID = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        txtJumlahPerUnit = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        chkReorderStatus = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtHargaJual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtHargaJual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHargaJual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHargaJualFocusGained(evt);
            }
        });
        txtHargaJual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHargaJualKeyPressed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setText("Harga Jual :");

        txtBarangID.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtBarangID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBarangIDKeyPressed(evt);
            }
        });

        jLabel34.setForeground(new java.awt.Color(0, 153, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Nama Barang :");

        jLabel35.setForeground(new java.awt.Color(0, 153, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Kode Barang :");

        txtNamaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaBarangKeyPressed(evt);
            }
        });

        txtJumlahPerUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJumlahPerUnitKeyPressed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(0, 153, 51));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Isi Kemasan :");

        btnCancel.setText("Kembali ke Form Barang");

        btnSimpan.setText("Simpan Data Barang");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        chkReorderStatus.setText("Barang akan diorder ulang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(chkReorderStatus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHargaJual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtBarangID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtJumlahPerUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtNamaBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarangID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlahPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkReorderStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaJualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHargaJualFocusGained

}//GEN-LAST:event_txtHargaJualFocusGained

    private void txtHargaJualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaJualKeyPressed
        formSystematization.nextfocus(evt);
}//GEN-LAST:event_txtHargaJualKeyPressed

    private void txtBarangIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarangIDKeyPressed
        formSystematization.nextfocus(evt);
}//GEN-LAST:event_txtBarangIDKeyPressed

    private void txtNamaBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaBarangKeyPressed
        formSystematization.nextfocus(evt);
}//GEN-LAST:event_txtNamaBarangKeyPressed

    private void txtJumlahPerUnitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahPerUnitKeyPressed
        formSystematization.nextfocus(evt);
}//GEN-LAST:event_txtJumlahPerUnitKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            Insert_Barang();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(frmEntriBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
}//GEN-LAST:event_btnSimpanActionPerformed

    PreparedStatement stmInsertBarang;

    void initData () {
        try {
            stmInsertBarang = Main.data.getActiveConnection().prepareStatement("SELECT INSERT_BARANG (?,?,?,?,?)");
        } catch (SQLException ex) {
            Logger.getLogger(frmEntriBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    void Insert_Barang () throws SQLException {
        stmInsertBarang.setObject(1, txtBarangID.getText());
        stmInsertBarang.setObject(2, txtNamaBarang.getText());
        stmInsertBarang.setObject(3, txtJumlahPerUnit.getText());
        JOptionPane.showMessageDialog(rootPane, "Text : " + txtHargaJual.getText() + ", Value : " + txtHargaJual.getValue() );
        stmInsertBarang.setObject(4, txtHargaJual.getValue());
        stmInsertBarang.setObject(5, chkReorderStatus.isSelected());

        stmInsertBarang.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JCheckBox chkReorderStatus;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    static javax.swing.JTextField txtBarangID;
    private javax.swing.JFormattedTextField txtHargaJual;
    static javax.swing.JTextField txtJumlahPerUnit;
    static javax.swing.JTextField txtNamaBarang;
    // End of variables declaration//GEN-END:variables

}
