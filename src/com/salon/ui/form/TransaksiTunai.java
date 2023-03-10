/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TransaksiTunai.java
 *
 * Created on 17-Feb-2009, 17:51:42
 */

package com.salon.ui.form;

import com.salon.launcher.Main;
import com.salon.util.formSystematization;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Ahmad Thahir
 */
public class TransaksiTunai extends javax.swing.JDialog {

    /** Creates new form TransaksiTunai */
    //public TransaksiTunai () {
    //    this.setModal(true);
    //    initComponents();
    //    formSystematization.CenterScreen(this);
    //}
    public TransaksiTunai(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);
        try {
            initData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex , "error : initData(()", JOptionPane.ERROR_MESSAGE);
        }
    }

    public TransaksiTunai(java.awt.Frame parent, boolean modal, String textValidasi) {
        super(parent, modal);
        this.textValidasi=textValidasi;
        initComponents();

        setLocationRelativeTo(null);
        try {
            initData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex , "error : initData(()", JOptionPane.ERROR_MESSAGE);
        }
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JFormattedTextField();
        btnBatal = new javax.swing.JButton();
        txtNamPendek = new javax.swing.JTextField();
        txtNamaKaryawan = new javax.swing.JTextField();
        txtIdKaryawan = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblNaPen = new javax.swing.JLabel();
        txtValidasi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jLabel1.setText("Jumlah :");

        jLabel2.setText("Keterangan :");

        txtJumlah.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txtJumlah.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJumlahKeyPressed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        btnBatal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBatalKeyPressed(evt);
            }
        });

        txtNamPendek.setEditable(false);
        txtNamPendek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamPendekKeyPressed(evt);
            }
        });

        txtNamaKaryawan.setEditable(false);
        txtNamaKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKaryawanKeyPressed(evt);
            }
        });

        txtIdKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKaryawanKeyPressed(evt);
            }
        });

        lblId.setText("Id. Karyawan :");

        lblNama.setText("Nama Karyawan :");

        lblNaPen.setText("Nama Pendek :");

        DocumentFilter filter = new DocumentFilter() {

            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                super.insertString(fb, offset, string.toUpperCase(), attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                super.replace(fb, offset, length, text.toUpperCase(), attrs);
            }

        };

        ((AbstractDocument) txtValidasi.getDocument()).setDocumentFilter(filter);
        txtValidasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValidasiKeyPressed(evt);
            }
        });

        lblNote.setText("<html>Ketik '" + textValidasi + "' kemudian 'ENTER' untuk Validasi data, sebelum memvalidasi Data, " +
            "harap periksa data anda dengan teliti</html>");

        jLabel4.setText("UANG :");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        txtKeterangan.setTabSize(0);
        txtKeterangan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeteranganKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtKeterangan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNote, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addGap(167, 167, 167))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId)
                            .addComponent(lblNaPen)
                            .addComponent(lblNama)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamaKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtNamPendek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtIdKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValidasi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamPendek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNaPen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNote, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(txtValidasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Statement stmGetData;
    ResultSet rsGetData;
    
    Object id;

    public void setId(Object id) {
        this.id = id;
    }

    public Object getId() {
        return id;
    }

    PreparedStatement stmTransaksi;

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        hide();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtJumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyPressed
        formKeyboardSortcut(evt);
        formSystematization.nextfocus(evt);
    }//GEN-LAST:event_txtJumlahKeyPressed

    private void txtIdKaryawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKaryawanKeyPressed
        formKeyboardSortcut(evt);
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try {
                stmGetData = Main.data.getActiveConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rsGetData=stmGetData.executeQuery("SELECT IDKARYAWAN, NAMAKARYAWAN, NAMAPENDEK FROM KARYAWAN " +
                        "WHERE IDKARYAWAN='" + txtIdKaryawan.getText() + "'");
                if (rsGetData.next()) {
                    id=rsGetData.getObject(1);
                    txtIdKaryawan.setText(rsGetData.getObject(1).toString());
                    txtNamaKaryawan.setText(rsGetData.getObject(2).toString());
                    txtNamPendek.setText(rsGetData.getObject(3).toString());

                    txtJumlah.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Karyawan dengan ID : " + txtIdKaryawan.getText() + " tidak ditemukan");
                    txtIdKaryawan.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TransaksiTunai.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtIdKaryawanKeyPressed

    private void txtNamaKaryawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKaryawanKeyPressed
        formKeyboardSortcut(evt);
    }//GEN-LAST:event_txtNamaKaryawanKeyPressed

    private void txtNamPendekKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamPendekKeyPressed
        formKeyboardSortcut(evt);
    }//GEN-LAST:event_txtNamPendekKeyPressed

    private void btnBatalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBatalKeyPressed
        formKeyboardSortcut(evt);

        
    }//GEN-LAST:event_btnBatalKeyPressed

    private void txtValidasiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValidasiKeyPressed
        txtValidasi.setText(txtValidasi.getText().toUpperCase());
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            Transaksi();
        }
    }//GEN-LAST:event_txtValidasiKeyPressed

    private void txtKeteranganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeteranganKeyPressed
        formKeyboardSortcut(evt);
        formSystematization.nextfocus(evt);
    }//GEN-LAST:event_txtKeteranganKeyPressed

    void initData () throws SQLException {}
    
    void Transaksi () {

        if (!txtValidasi.getText().equals(textValidasi)) {

            JOptionPane.showMessageDialog(rootPane, "Harap periksan kembali data anda");
            return;
        }
        
        try {
            ExecutePreparedStatement();
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    void ExecutePreparedStatement () throws SQLException {}

    void formKeyboardSortcut (KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE : dispose();
                break;
        }
    }

    String textValidasi;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnBatal;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    javax.swing.JLabel lblId;
    javax.swing.JLabel lblNaPen;
    javax.swing.JLabel lblNama;
    javax.swing.JLabel lblNote;
    javax.swing.JTextField txtIdKaryawan;
    javax.swing.JFormattedTextField txtJumlah;
    javax.swing.JTextArea txtKeterangan;
    javax.swing.JTextField txtNamPendek;
    javax.swing.JTextField txtNamaKaryawan;
    javax.swing.JTextField txtValidasi;
    // End of variables declaration//GEN-END:variables

}
