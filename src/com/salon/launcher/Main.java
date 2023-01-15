/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.salon.launcher;

import com.salon.ui.form.LoginForm;
import com.salon.ui.form.PreviewLaporan;
import com.salon.ui.form.frmBilling;
import com.salon.util.MyData;
import com.salon.util.formSystematization;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SAK
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static MyData data = new MyData();
    
    public static void main(String[] args) {

        try {
            data.setClassName("org.postgresql.Driver");
            data.setDbServer("jdbc:postgresql://localhost/salon");

            LoginForm login = new LoginForm(null, true) {

                @Override
                public Boolean Login() {
                    data.setUserName(txtUserName.getText());
                    data.setPassword(txtPassword.getText());
                    try {
                        data.getConnection();
                        dispose();
                        frmBilling perawatan = new frmBilling();
                        formSystematization.CenterScreen(perawatan);
                        perawatan.show();
                    } catch (SQLException ex) {
                        txtPassword.requestFocus();
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "error Login", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, ex, "error Login", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                    
                    return true;
                }
                @Override
                public void Batal() {

                    super.Batal();
                    System.exit(1);
                }                
            };
            
            login.setTitle("Login Form");
            formSystematization.MyStyle(login, "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            login.show();
            
        } catch (Exception ex) {
            Logger.getLogger(PreviewLaporan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "error : main (String[] args)", JOptionPane.ERROR_MESSAGE);

        }        
    }

}
