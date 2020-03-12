
package porters.lodge.managemnt;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileFilter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Register extends javax.swing.JFrame {

   
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    String ImgPath = null;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        title_panel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Jlabel_passport = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        combo_level = new javax.swing.JComboBox<>();
        combo_gender = new javax.swing.JComboBox<>();
        txtIndexNo = new javax.swing.JTextField();
        txtHallResidence = new javax.swing.JTextField();
        txtRoomNo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btn_search = new javax.swing.JButton();
        Jlabel_FirstName = new javax.swing.JLabel();
        Jlabel_MiddleName = new javax.swing.JLabel();
        Jlabel_LastName = new javax.swing.JLabel();
        Jlabel_Level = new javax.swing.JLabel();
        Jlabel_Gender = new javax.swing.JLabel();
        Jlabel_IndexNo = new javax.swing.JLabel();
        Jlabel_Hall_Residence = new javax.swing.JLabel();
        Jlabel_RoomNo = new javax.swing.JLabel();
        Jlabel_Password = new javax.swing.JLabel();
        Jlabel_already_account = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_Click_login = new javax.swing.JButton();
        btn_Chose_Image = new javax.swing.JButton();
        btn_Delete_Image = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_panel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_panel.setForeground(new java.awt.Color(255, 255, 255));
        title_panel.setText("                 PORTERS LODGE REGISTRATION");
        getContentPane().add(title_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 530, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setOpaque(false);

        Jlabel_passport.setBackground(new java.awt.Color(255, 255, 255));
        Jlabel_passport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        combo_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "100", "200", "300", "400" }));
        combo_level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_levelActionPerformed(evt);
            }
        });

        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", " " }));

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_search.setText("Search Student");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        Jlabel_FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_FirstName.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_FirstName.setText("First Name:");

        Jlabel_MiddleName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_MiddleName.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_MiddleName.setText("Middle Name:");

        Jlabel_LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_LastName.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_LastName.setText("Last Name:");

        Jlabel_Level.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_Level.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_Level.setText("Level:");

        Jlabel_Gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_Gender.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_Gender.setText("Gender:");

        Jlabel_IndexNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_IndexNo.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_IndexNo.setText("Index No:");

        Jlabel_Hall_Residence.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_Hall_Residence.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_Hall_Residence.setText("Hall Resdience:");

        Jlabel_RoomNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_RoomNo.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_RoomNo.setText("Room No:");

        Jlabel_Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jlabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_Password.setText("Password:");

        Jlabel_already_account.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Jlabel_already_account.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_already_account.setText("Already Have An Account?");

        btn_save.setText("SIGN UP");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_Click_login.setText("Click To Login");
        btn_Click_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Click_loginActionPerformed(evt);
            }
        });

        btn_Chose_Image.setBackground(new java.awt.Color(0, 102, 102));
        btn_Chose_Image.setText("Upload");
        btn_Chose_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Chose_ImageActionPerformed(evt);
            }
        });

        btn_Delete_Image.setBackground(new java.awt.Color(255, 51, 51));
        btn_Delete_Image.setText("Delete");
        btn_Delete_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Delete_ImageActionPerformed(evt);
            }
        });

        warning.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        warning.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jlabel_already_account, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_Click_login)
                        .addGap(43, 43, 43)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlabel_FirstName)
                            .addComponent(Jlabel_MiddleName)
                            .addComponent(Jlabel_LastName)
                            .addComponent(Jlabel_Level)
                            .addComponent(Jlabel_Gender)
                            .addComponent(Jlabel_IndexNo)
                            .addComponent(Jlabel_Hall_Residence)
                            .addComponent(Jlabel_RoomNo)
                            .addComponent(Jlabel_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRoomNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_level, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIndexNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHallResidence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(Jlabel_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btn_Chose_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(btn_Delete_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel_FirstName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jlabel_MiddleName)
                            .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel_LastName))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_level, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel_Level))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel_Gender))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel_IndexNo))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHallResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel_Hall_Residence))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jlabel_RoomNo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jlabel_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Chose_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_search))
                    .addComponent(Jlabel_Password))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jlabel_already_account, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Click_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 920, 600));

        background_image.setForeground(new java.awt.Color(255, 255, 255));
        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/porters/lodge/managemnt/4790.jpg"))); // NOI18N
        background_image.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        background_image.setOpaque(true);
        getContentPane().add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1010, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_levelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_levelActionPerformed

    private void btn_Click_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Click_loginActionPerformed
        // back to login
        Login lgf = new Login();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_Click_loginActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        String roomno = txtRoomNo.getText();
        String pass = txtPassword.getText().toString();
        
        if(roomno.equals("name") && pass.equals("pass")){
            
        }
        else if(roomno.isEmpty() && pass.isEmpty())
        {
            warning.setText(" RoomNo & Password is Required! ");
            Toolkit.getDefaultToolkit().beep();
        }
        else if(roomno.isEmpty()){
            warning.setText(" RoomNo is Required! ");
            Toolkit.getDefaultToolkit().beep();
            
        }
        else if(pass.isEmpty()){
            warning.setText(" Password is Required! ");
            Toolkit.getDefaultToolkit().beep();
        }
         else{
             warning.setText(" NOT CONNECTED TO DATABASE ");
            Toolkit.getDefaultToolkit().beep();
             
         }
       
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_Chose_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Chose_ImageActionPerformed
        // choosing image:
        JFileChooser file = new JFileChooser();
    file.setCurrentDirectory(new File(System.getProperty("user.home")));
    
    FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image","jpg","png");
    file.addChoosableFileFilter(filter);
    int result = file.showSaveDialog(null);
    
    if(result == JFileChooser.APPROVE_OPTION)
    {
        File selectedFile = file.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        Jlabel_passport.setIcon(ResizeImage (path,null));
    }
    else
    {   
        System.out.println("No File Selected");
    }
    }//GEN-LAST:event_btn_Chose_ImageActionPerformed

    private void btn_Delete_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Delete_ImageActionPerformed
        // Delete Image:
        Jlabel_passport.setIcon(null);
    }//GEN-LAST:event_btn_Delete_ImageActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        /*
        
       
        */
               
    }//GEN-LAST:event_btn_searchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    
    //Resize Image:
     public ImageIcon ResizeImage(String imagePath, byte[] pic)
    {
        ImageIcon myImage = null;
        
        if(imagePath !=null)
        {
            myImage = new ImageIcon(imagePath);
        }
        else
        {
            myImage = new ImageIcon(pic);
        }
        
        Image img =  myImage.getImage();
        Image img2 = img.getScaledInstance(Jlabel_passport.getWidth(), Jlabel_passport.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;   
    }
    
    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_FirstName;
    private javax.swing.JLabel Jlabel_Gender;
    private javax.swing.JLabel Jlabel_Hall_Residence;
    private javax.swing.JLabel Jlabel_IndexNo;
    private javax.swing.JLabel Jlabel_LastName;
    private javax.swing.JLabel Jlabel_Level;
    private javax.swing.JLabel Jlabel_MiddleName;
    private javax.swing.JLabel Jlabel_Password;
    private javax.swing.JLabel Jlabel_RoomNo;
    private javax.swing.JLabel Jlabel_already_account;
    private javax.swing.JLabel Jlabel_passport;
    private javax.swing.JLabel background_image;
    private javax.swing.JButton btn_Chose_Image;
    private javax.swing.JButton btn_Click_login;
    private javax.swing.JButton btn_Delete_Image;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> combo_gender;
    private javax.swing.JComboBox<String> combo_level;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title_panel;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHallResidence;
    private javax.swing.JTextField txtIndexNo;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables

    
}
