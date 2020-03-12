/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porters.lodge.managemnt;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Prince Ampomah
 */
public class Adminregister extends javax.swing.JFrame {

    /**
     * Creates new form Adminregister
     */
    public Adminregister() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        passcode_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpasscode = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        warning2 = new javax.swing.JLabel();
        warning1 = new javax.swing.JLabel();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTER REGISTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 240, 30));

        passcode_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passcode_label.setForeground(new java.awt.Color(255, 255, 255));
        passcode_label.setText("PASSWORD:");
        getContentPane().add(passcode_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 20));

        username_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("ADMIN ID:");
        getContentPane().add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        btn_signup.setText("SIGN UP");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 100, 30));
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 250, 30));
        getContentPane().add(txtpasscode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, 30));

        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 90, 30));

        warning2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        warning2.setForeground(java.awt.Color.red);
        getContentPane().add(warning2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 320, 30));

        warning1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        warning1.setForeground(java.awt.Color.red);
        getContentPane().add(warning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 20));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/porters/lodge/managemnt/4790.jpg"))); // NOI18N
        background_img.setText("jLabel2");
        getContentPane().add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
       
         String admin = txtusername.getText();
        String pass  = txtpasscode.getText().toString();
        
        if(admin.equals("name") && pass.equals("passcode")){
            
            
        }
            
        else if(admin.isEmpty() && pass.isEmpty()){
                warning1.setText("Warning");
               warning2.setText("Admin Name and Password is required");
               Toolkit.getDefaultToolkit().beep();
            }
            else if(admin.isEmpty())
            {
                warning1.setText("Warining");
                warning2.setText("Admin Name is required");
                Toolkit.getDefaultToolkit().beep();
            }
            else if(pass.isEmpty())
            {
                warning1.setText("warining");
                warning2.setText(" Password is required");
                Toolkit.getDefaultToolkit().beep();
            }
            
        
        else{
                warning1.setText("warining");
                warning2.setText(" Incorrect Admin ID && Password! ");
                Toolkit.getDefaultToolkit().beep();
            
        
        }
   

        
        //username and password condition:
       
        
    }//GEN-LAST:event_btn_signupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Login lg = new Login();
       lg.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_img;
    private javax.swing.JButton btn_signup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passcode_label;
    private javax.swing.JPasswordField txtpasscode;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel username_label;
    private javax.swing.JLabel warning1;
    private javax.swing.JLabel warning2;
    // End of variables declaration//GEN-END:variables
}