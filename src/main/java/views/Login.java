/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;

/**
 *
 * @author mdark
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TxtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        RBMostrar = new javax.swing.JCheckBox();
        LBSalir = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 223, 203));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdark\\OneDrive\\Escritorio\\proyecto programacion 1\\logo version 2.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 310, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 630));

        jPanel2.setBackground(new java.awt.Color(55, 73, 97));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio De Sesión");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        TxtUser.setBackground(new java.awt.Color(55, 73, 97));
        TxtUser.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        TxtUser.setForeground(new java.awt.Color(255, 255, 255));
        TxtUser.setText("Usuario O Correo");
        TxtUser.setBorder(null);
        TxtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtUser.setName(""); // NOI18N
        TxtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtUserMouseClicked(evt);
            }
        });
        TxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUserActionPerformed(evt);
            }
        });
        jPanel2.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 280, 50));
        TxtUser.getAccessibleContext().setAccessibleDescription("");

        jSeparator2.setBackground(new java.awt.Color(62, 77, 94));
        jSeparator2.setForeground(new java.awt.Color(62, 77, 94));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 480, 30));

        TxtPassword.setBackground(new java.awt.Color(55, 73, 97));
        TxtPassword.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        TxtPassword.setForeground(new java.awt.Color(255, 255, 255));
        TxtPassword.setText("Password");
        TxtPassword.setBorder(null);
        TxtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 280, 50));

        jSeparator1.setBackground(new java.awt.Color(62, 77, 94));
        jSeparator1.setForeground(new java.awt.Color(62, 77, 94));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 480, 30));

        RBMostrar.setBackground(new java.awt.Color(55, 73, 97));
        RBMostrar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        RBMostrar.setForeground(new java.awt.Color(255, 255, 255));
        RBMostrar.setText("Mostrar Contraseña");
        RBMostrar.setBorder(null);
        RBMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(RBMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        LBSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        LBSalir.setForeground(new java.awt.Color(255, 255, 255));
        LBSalir.setText("X");
        LBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBSalirMouseClicked(evt);
            }
        });
        jPanel2.add(LBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 20, 30));

        BtnIngresar.setBackground(new java.awt.Color(110, 223, 203));
        BtnIngresar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        BtnIngresar.setText("INGRESAR");
        jPanel2.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 200, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Aun no tienes cuenta? ");
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorMoved1(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel2MouseWheelMoved(evt);
            }
        });
        jLabel2.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jLabel2AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 160, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrarte");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 660, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtPasswordMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordMouseClicked

    private void TxtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUserMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUserMouseClicked

    private void LBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBSalirMouseClicked
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_LBSalirMouseClicked

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel2AncestorMoved

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorMoved

    private void jLabel2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel2MouseWheelMoved
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseWheelMoved

    private void jLabel2AncestorMoved1(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorMoved1
  
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorMoved1

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void RBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMostrarActionPerformed
if (RBMostrar.isSelected()==true){
TxtPassword.setEchoChar((char)0);
}

else if (RBMostrar.isSelected()==false){
TxtPassword.setEchoChar('*');
}
    // TODO add your handling code here:
    }//GEN-LAST:event_RBMostrarActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered

        jLabel3.setForeground(Color.cyan);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void TxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUserActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
SingUp Show_SingUp = new SingUp();
Show_SingUp.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

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
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel LBSalir;
    private javax.swing.JCheckBox RBMostrar;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
