/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * panelTransferGaji.java
 *
 * Created on 31 Mar 10, 15:26:56
 */

package com.salon.ui.panel;

import com.salon.launcher.Main;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.java2d.Disposer;

/**
 *
 * @author User
 */
public class panelTransferGaji extends javax.swing.JPanel {

    /** Creates new form panelTransferGaji */
    public panelTransferGaji() {
        initComponents();
        initData();
    }

    Statement stmGetData;
    ResultSet rsGetData;

    PreparedStatement stmTransfer;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtIdKaryawan = new javax.swingx.tJTextField();
        txtTotalGaji = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        txtNamaKaryawan = new javax.swingx.tJTextField();
        jLabel1 = new javax.swing.JLabel();
        btnTransfer = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        jLabel4.setText("Keterangan :");

        txtIdKaryawan.setCharacterCasing(javax.swingx.tJTextField.CharacterCasing.UPPER);
        txtIdKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKaryawanKeyPressed(evt);
            }
        });

        txtTotalGaji.setEditable(false);

        jLabel2.setText("Nama Karyawan :");

        jLabel3.setText("Total Gaji :");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        txtKeterangan.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtKeterangan);

        txtNamaKaryawan.setEditable(false);
        txtNamaKaryawan.setCharacterCasing(javax.swingx.tJTextField.CharacterCasing.UPPER);

        jLabel1.setText("Id Karyawan :");

        btnTransfer.setText("Transfer Gaji Karyawan");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdKaryawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(txtNamaKaryawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(txtTotalGaji, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnTransfer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        Batal();
}//GEN-LAST:event_btnBatalActionPerformed

    private void txtIdKaryawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKaryawanKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try {
                CariKaryawan(Integer.parseInt(txtIdKaryawan.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(panelTransferGaji.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(btnTransfer, ex.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(panelTransferGaji.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(btnTransfer, ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtIdKaryawanKeyPressed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        try {
            Transfer(Integer.parseInt(txtIdKaryawan.getText()));
            JOptionPane.showMessageDialog(btnTransfer, "Selesai mentransfer Gaji Karyawan");
            Batal();
        } catch (SQLException ex) {
            Logger.getLogger(panelTransferGaji.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(btnTransfer, ex.getMessage());
        }
    }//GEN-LAST:event_btnTransferActionPerformed

    void initData () {
        try {
            stmGetData=Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            initPreparedStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void initPreparedStatement () throws SQLException {
        stmTransfer=Main.data.getActiveConnection().prepareStatement("SELECT TRANSFERGAJI(?)");
    }

    void CariKaryawan (int IdKaryawan) throws SQLException, Exception {
        rsGetData=stmGetData.executeQuery("SELECT IDKARYAWAN, NAMAKARYAWAN, (GAJIPOKOK+TJGTRANSPORT+TJGISTRI+TJGANAK+TJGKESEHATAN) AS GAJI " +
                "FROM KARYAWAN " +
                "INNER JOIN GAJI USING(IDKARYAWAN) " +
                "WHERE IDKARYAWAN=" + txtIdKaryawan.getText());
        rsGetData.beforeFirst();
        if (rsGetData.next()) {
            txtNamaKaryawan.setText(rsGetData.getObject("NAMAKARYAWAN").toString());
            txtTotalGaji.setValue(rsGetData.getObject("GAJI"));
            txtKeterangan.requestFocus();
        } else {
            txtNamaKaryawan.setText("");
            txtKeterangan.setText("");
            txtIdKaryawan.setText("");
            txtIdKaryawan.requestFocus();
            throw new Exception("Data Karyawan tidak ditemukan, silahkan coba lagi");
        }
    }

    void Transfer (int IdKaryawan) throws SQLException {
        int rs = JOptionPane.showConfirmDialog(this, "Anda akan mentransfer Gaji Karyawan ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (rs==JOptionPane.YES_OPTION) {
            stmTransfer.setObject(1, IdKaryawan);
            stmTransfer.execute();
        }
    }

    public void Batal () {}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnBatal;
    javax.swing.JButton btnTransfer;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JScrollPane jScrollPane1;
    javax.swingx.tJTextField txtIdKaryawan;
    private javax.swing.JTextArea txtKeterangan;
    javax.swingx.tJTextField txtNamaKaryawan;
    javax.swing.JFormattedTextField txtTotalGaji;
    // End of variables declaration//GEN-END:variables

}
