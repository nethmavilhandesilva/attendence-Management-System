/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Dao.ConnectionProvider;
import Utility.BDUtility;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.Spring.scale;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Sadini Kavindya
 */
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form UserRegistration
     */
    public UserRegistration() {
        initComponents();
        BDUtility.setImage(this, "Images/abc1.jpg", 935, 547);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblImage = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utility/Images/abc1.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(935, 547));
        setMinimumSize(new java.awt.Dimension(935, 547));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USER REGISTRATION");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");

        txtName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Gender");

        radioMale.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        radioMale.setForeground(new java.awt.Color(0, 0, 0));
        radioMale.setText("Male");
        radioMale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioMaleItemStateChanged(evt);
            }
        });

        radioFemale.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        radioFemale.setForeground(new java.awt.Color(0, 0, 0));
        radioFemale.setText("Female");
        radioFemale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioFemaleItemStateChanged(evt);
            }
        });
        radioFemale.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                radioFemaleCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Address");

        txtCountry.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtCountry.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Country");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("State");

        txtState.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtState.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contact");

        txtContact.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtContact.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Email");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));

        jInternalFrame1.setVisible(true);

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRegister.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnExit1.setText("X");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1)
                .addGap(393, 393, 393)
                .addComponent(btnExit1))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioMale)
                        .addGap(18, 18, 18)
                        .addComponent(radioFemale))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnExit1)))
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMale)
                            .addComponent(radioFemale))
                        .addGap(24, 24, 24)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister)
                    .addComponent(btnClear)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    BufferedImage originalImage = null;
    File selectedFile = null;

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            try {
                originalImage = ImageIO.read(selectedFile);
                int originalWidth = originalImage.getWidth();
                int originalHeight = originalImage.getHeight();

                int labelWidth = lblImage.getWidth();
                int labelHeight = lblImage.getHeight();

                double scaleX = (double) labelWidth / originalWidth;
                double scaleY = (double) labelHeight / originalHeight;

                double scale = Math.min(scaleX, scaleY);

                int scaledWidth = (int) (originalWidth * scale);
                int scaledHeight = (int) (originalHeight * scale);

                Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

                ImageIcon icon = new ImageIcon(scaledImage);
                lblImage.setIcon(icon);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_lblImageMouseClicked

    private void radioMaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioMaleItemStateChanged
        if (radioMale.isSelected()) {
            radioFemale.setSelected(false);
        }
    }//GEN-LAST:event_radioMaleItemStateChanged

    private void radioFemaleCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_radioFemaleCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleCaretPositionChanged

    private void radioFemaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioFemaleItemStateChanged
        if (radioMale.isSelected()) {
            radioMale.setSelected(false);
    }//GEN-LAST:event_radioFemaleItemStateChanged
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        ClearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            String name = txtName.getText().toString();
            String gender = "";
            if (radioMale.isSelected()) {
                gender = "Male";
            } else if (radioFemale.isSelected()) {
                gender = "Female";
            }
            String email = txtEmail.getText().toString();
            String emailRegex = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
            if (!email.matches(emailRegex)) {
                JOptionPane.showMessageDialog(null, "Invalid Email.", "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String contact = txtContact.getText().toString();
            String contactRegex = "^[0-9]*$";
            if (!contact.matches(contactRegex)) {
                JOptionPane.showMessageDialog(null, "Invalid Conatct Number", "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String address = txtAddress.getText().toString();
            String state = txtState.getText().toString();
            String country = txtCountry.getText().toString();
            String uniqueregid = "" + System.nanoTime() + System.nanoTime() + System.nanoTime();

            if (name.isEmpty() || email.isEmpty() || contact.isEmpty() || address.isEmpty() || state.isEmpty() || country.isEmpty() || uniqueregid.isEmpty() || gender.isEmpty()) {
                JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty.", "Field Empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Connection connection = ConnectionProvider.getCon();
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery("select*from userdetails where email='" + email.trim() + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Duplicate email.", "Duplicate", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex);
            }
            String imageName = saveImage(email);
            Connection con=ConnectionProvider.getCon();
            String insertQuery = "INSERT into userdetails(name,gender,email,contract,address,state,country,uniqueregid,imagename)VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
            
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,gender);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,contact);
            preparedStatement.setString(5,address);
            preparedStatement.setString(6,state);
            preparedStatement.setString(7,country);
            preparedStatement.setString(8,uniqueregid);
            preparedStatement.setString(9,imageName);
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null,"User Registered Successfully");
            ClearForm();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed
    private String saveImage(String email) {
        if (originalImage != null && selectedFile != null) {
            try {
                String savePath = BDUtility.getPath("Images\\");
                String extension = BDUtility.getFileExtention(selectedFile.getName());
                String imageName = email + "." + extension;
                File saveFile = new File(savePath + imageName);
                BufferedImage scaledImage = BDUtility.scaleImage(originalImage, ImageIO.read(selectedFile));
                ImageIO.write(scaledImage, extension, saveFile);
                return imageName;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    private void ClearForm() {
        txtName.setText("");
        txtEmail.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        txtState.setText("");
        txtCountry.setText("");
        radioMale.setSelected(false);
        radioFemale.setSelected(false);
        lblImage.setIcon(null);
    }

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
