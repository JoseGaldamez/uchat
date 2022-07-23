/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.RegisterController;
import java.awt.Color;
import models.RegisterModel;

/**
 *
 * @author mdark
 */
public class SingUp extends javax.swing.JFrame {

    /**
     * Creates new form SingUp
     */
    public SingUp() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtPassword1 = new javax.swing.JPasswordField();
        CBPassword1 = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        txtPassword2 = new javax.swing.JPasswordField();
        CBPassword2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JLIngresar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 223, 203));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 310, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 810));

        jPanel2.setBackground(new java.awt.Color(55, 73, 97));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        txtUser.setBackground(new java.awt.Color(55, 73, 97));
        txtUser.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 40));

        jSeparator1.setBackground(new java.awt.Color(62, 77, 94));
        jSeparator1.setForeground(new java.awt.Color(62, 77, 94));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 450, 20));

        txtName.setBackground(new java.awt.Color(55, 73, 97));
        txtName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 300, 40));

        jSeparator2.setBackground(new java.awt.Color(62, 77, 94));
        jSeparator2.setForeground(new java.awt.Color(62, 77, 94));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 450, 20));

        txtEmail.setBackground(new java.awt.Color(55, 73, 97));
        txtEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 300, 40));

        jSeparator3.setBackground(new java.awt.Color(62, 77, 94));
        jSeparator3.setForeground(new java.awt.Color(62, 77, 94));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 20));

        txtPassword1.setBackground(new java.awt.Color(55, 73, 97));
        txtPassword1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtPassword1.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword1.setText("Password");
        txtPassword1.setBorder(null);
        jPanel2.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 300, 40));

        CBPassword1.setBackground(new java.awt.Color(55, 73, 97));
        CBPassword1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        CBPassword1.setForeground(new java.awt.Color(255, 255, 255));
        CBPassword1.setText("Ver Contraseña");
        CBPassword1.setBorder(null);
        CBPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPassword1ActionPerformed(evt);
            }
        });
        jPanel2.add(CBPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(62, 77, 94));
        jSeparator4.setForeground(new java.awt.Color(62, 77, 94));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 450, 20));

        txtPassword2.setBackground(new java.awt.Color(55, 73, 97));
        txtPassword2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtPassword2.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword2.setText("Confirm Password");
        txtPassword2.setBorder(null);
        jPanel2.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 300, 40));

        CBPassword2.setBackground(new java.awt.Color(55, 73, 97));
        CBPassword2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        CBPassword2.setForeground(new java.awt.Color(255, 255, 255));
        CBPassword2.setText("Ver Contraseña");
        CBPassword2.setBorder(null);
        CBPassword2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPassword2ActionPerformed(evt);
            }
        });
        jPanel2.add(CBPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(110, 223, 203));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("REGISTRARME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 190, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Ya tienes Cuenta?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, -1, -1));

        JLIngresar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        JLIngresar.setForeground(new java.awt.Color(255, 255, 255));
        JLIngresar.setText("Ingresar");
        JLIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLIngresarMouseExited(evt);
            }
        });
        jPanel2.add(JLIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 690, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel8.setText("Nombre");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 560, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLIngresarMouseEntered
JLIngresar.setForeground(Color.cyan);
        // TODO add your handling code here:
    }//GEN-LAST:event_JLIngresarMouseEntered

    private void JLIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLIngresarMouseExited
JLIngresar.setForeground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_JLIngresarMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void JLIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLIngresarMouseClicked
Login Show_Login = new Login();
Show_Login.setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_JLIngresarMouseClicked

    private void CBPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPassword1ActionPerformed
if(CBPassword1.isSelected() == true){
    txtPassword1.setEchoChar((char)0);
}
else if(CBPassword1.isSelected() == false){
        txtPassword1.setEchoChar('*');
}

       
    }//GEN-LAST:event_CBPassword1ActionPerformed

    private void CBPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPassword2ActionPerformed
if(CBPassword2.isSelected() == true){
    txtPassword2.setEchoChar((char)0);
}
else if(CBPassword2.isSelected() == false){
        txtPassword2.setEchoChar('*');
}

    }//GEN-LAST:event_CBPassword2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p1 = String.valueOf(txtPassword1.getPassword());
        String p2 = String.valueOf(txtPassword2.getPassword());
                
        
        if (!p1.equals(p2)) {
            return;
        }
        
        RegisterModel registerModel = new RegisterModel(txtName.getText(), txtUser.getText(), txtEmail.getText(), String.valueOf(txtPassword1.getPassword()) );
        
        boolean response = RegisterController.registerUser(registerModel);
        if (response) {
            System.out.println("Todo salio bien, usuario guardado");
        } else {
            System.out.println("Algo fallo al guardar al usuario");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBPassword1;
    private javax.swing.JCheckBox CBPassword2;
    private javax.swing.JLabel JLIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
