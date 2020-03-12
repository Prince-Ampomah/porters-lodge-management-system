 


package porters.lodge.managemnt;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RoomNo_label = new javax.swing.JLabel();
        Password_label = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        btn_Login = new javax.swing.JButton();
        btn_create_account = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoomNo_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RoomNo_label.setForeground(new java.awt.Color(255, 255, 255));
        RoomNo_label.setText("ADMIN ID:");
        getContentPane().add(RoomNo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Password_label.setForeground(new java.awt.Color(255, 255, 255));
        Password_label.setText("PASSWORD:");
        getContentPane().add(Password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 30));

        btn_Login.setBackground(new java.awt.Color(255, 255, 255));
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        btn_create_account.setBackground(java.awt.Color.white);
        btn_create_account.setText("Create New Account");
        btn_create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_accountActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        warning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        warning.setForeground(java.awt.Color.red);
        getContentPane().add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 20));

        warningLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        warningLabel.setForeground(java.awt.Color.red);
        getContentPane().add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 370, 20));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("     PORTERS LODGE LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 270, 30));

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/porters/lodge/managemnt/4790.jpg"))); // NOI18N
        getContentPane().add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 470, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_create_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_accountActionPerformed
        // action for create new account
      
        Adminregister ad = new Adminregister();
        ad.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_create_accountActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        // login action:
        Register rgf = new Register();
        rgf.setVisible(true);
        this.dispose();
        
        /*
        String Roomno = txtRoomNo.getText();
        String password = txtPassword.getText().toString();
       
        if (Roomno.equals("name") && password.equals("pass"))
        {
            
            
            }
        else if (Roomno.isEmpty() || password.isEmpty())
        {
            if(Roomno.isEmpty() && password.isEmpty())
            {
                //when both room number and password are not entered
                 warning.setText(" Warning!! ");
                warningLabel.setText("Room Number and Password is empty!");
                Toolkit.getDefaultToolkit().beep();
            }
            else if(password.isEmpty())
            {
                //when password is not entered
                warning.setText(" Warning!!! ");
                warningLabel.setText(" Enter the Password! ");
                Toolkit.getDefaultToolkit().beep();
            }
            else if(Roomno.isEmpty())
            {
                //when Room number is not entere
                warning.setText(" Warning!! ");
                warningLabel.setText(" Enter the Room Number! ");
                Toolkit.getDefaultToolkit().beep();
            }
        }
        else{
            //when either the Room number or the Password is entered wrongly
            warning.setText(" Warning!!");
            warningLabel.setText("Incorrect Room Number or Password! Try Again!");
            Toolkit.getDefaultToolkit().beep();
        }
        */

    }//GEN-LAST:event_btn_LoginActionPerformed

    private void txtRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtRoomNoActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password_label;
    private javax.swing.JLabel RoomNo_label;
    private javax.swing.JLabel background_image;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_create_account;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JLabel warning;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
