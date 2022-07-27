package views;

import controllers.RegisterController;
import java.awt.Color;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.RegisterModel;

/**
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
        jPanel2 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JPasswordField();
        CBPassword1 = new javax.swing.JCheckBox();
        txtPassword2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JLIngresar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 223, 203));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 600));

        jPanel2.setBackground(new java.awt.Color(55, 73, 97));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(65, 87, 117));
        txtUser.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 300, 40));

        txtName.setBackground(new java.awt.Color(65, 87, 117));
        txtName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 40));

        txtEmail.setBackground(new java.awt.Color(65, 87, 117));
        txtEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 300, 40));

        txtPassword1.setBackground(new java.awt.Color(65, 87, 117));
        txtPassword1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtPassword1.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel2.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 300, 40));

        CBPassword1.setBackground(new java.awt.Color(55, 73, 97));
        CBPassword1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        CBPassword1.setForeground(new java.awt.Color(255, 255, 255));
        CBPassword1.setText("Ver Contraseña");
        CBPassword1.setBorder(null);
        CBPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPassword1ActionPerformed(evt);
            }
        });
        jPanel2.add(CBPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        txtPassword2.setBackground(new java.awt.Color(65, 87, 117));
        txtPassword2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtPassword2.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel2.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 300, 40));

        jButton1.setBackground(new java.awt.Color(110, 223, 203));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 300, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Ya tienes Cuenta?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        JLIngresar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
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
        jPanel2.add(JLIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirmar");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 390, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLIngresarMouseExited
        JLIngresar.setForeground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_JLIngresarMouseExited

    private void JLIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLIngresarMouseEntered
        JLIngresar.setForeground(new Color(120, 223, 203, 255));
        // TODO add your handling code here:
    }//GEN-LAST:event_JLIngresarMouseEntered

    private void JLIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLIngresarMouseClicked
        Login Show_Login = new Login();
        Show_Login.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_JLIngresarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p1 = String.valueOf(txtPassword1.getPassword());
        String p2 = String.valueOf(txtPassword2.getPassword());

        if (!p1.equals(p2)) {
            return;
        }

        RegisterModel registerModel = new RegisterModel(txtName.getText(), txtUser.getText(), txtEmail.getText(), String.valueOf(txtPassword1.getPassword()) );

        boolean response = false;
        try {
            response = RegisterController.registerUser(registerModel);
        } catch (InterruptedException ex) {
            Logger.getLogger(SingUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(SingUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (response) {
            System.out.println("Todo salio bien, usuario guardado");
        } else {
            System.out.println("Algo fallo al guardar al usuario");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPassword1ActionPerformed
        if(CBPassword1.isSelected() == true){
            txtPassword1.setEchoChar((char)0);
            txtPassword2.setEchoChar((char)0);
        }
        else if(CBPassword1.isSelected() == false){
            txtPassword1.setEchoChar('*');
            txtPassword2.setEchoChar('*');
        }

    }//GEN-LAST:event_CBPassword1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBPassword1;
    private javax.swing.JLabel JLIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
