package views;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.EventListener;
import com.google.cloud.firestore.FirestoreException;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import components.Messages;
import components.Panels;
import controllers.ChatController;
import firebase.FirebaseConnection;
import firebase.UserFirebase;
import java.awt.Adjustable;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import models.MessageModel;
import models.UserFirebaseModel;
import utils.ImagesOfProject;

/**
 * @author jose_galdamez
 */
public class PrincipalView extends javax.swing.JFrame {
    
    List<String> listMessages = new ArrayList<>();
    List<UserFirebaseModel> userlist = new ArrayList<>();
    
    
    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() throws InterruptedException, ExecutionException{
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("UChat - " + UserFirebase.getUser().getName() + " <"+ UserFirebase.getUser().getEmail()+">" );
        
        panelChat.setLayout(new BoxLayout(panelChat, BoxLayout.Y_AXIS));
        listPeople.setLayout(new BoxLayout(listPeople, BoxLayout.Y_AXIS));
        panelChat.setBorder(new EmptyBorder(10,10,10,10));
        listPeople.setBorder(new EmptyBorder(10,10,10,10));
        
        System.out.println( UserFirebase.getUser().getImage() );
        
        avatarLabel.setIcon( ImagesOfProject.getAvatar( UserFirebase.getUser().getImage() ) );
        labelUser.setText(UserFirebase.getUser().getName());
        labelEmail.setText(UserFirebase.getUser().getEmail());
        
        
        fillPeople();
        fillChatList();
    }
    
    public void updateImage(){
        avatarLabel.setIcon( ImagesOfProject.getAvatar( UserFirebase.getUser().getImage() ) );
    }
    
    private void scrollToBottom(JScrollPane scrollPane) {
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }
    
    
    

    
    
    
    private void fillChatList() throws InterruptedException, ExecutionException{
        
        CollectionReference docRef = FirebaseConnection.db.collection("chats");
        docRef.addSnapshotListener(new EventListener<>(){
            
            @Override
            public void onEvent(QuerySnapshot t, FirestoreException fe) {
                
                for(QueryDocumentSnapshot document : t.getDocuments() ){
                    
                    String uid = document.getString("uid");
                    String name = document.getString("user");
                    String text = document.getString("text");
                    String mid = document.getId();
                    
                    MessageModel message = new MessageModel(uid, name, text, mid);
                    
                    if( !listMessages.contains(message.getMid()) ){
                        
                        System.out.println("Mensaje nuevo" + message.getUid() );
                        
                        if (message.getUid().equals(UserFirebase.getUser().getUid()) ) {
                            saveNewMessage( message.getText() );
                        } else {
                            addOtherMessage(message);
                        }
                        
                        listMessages.add(message.getMid());
                    }
                    
                    
                }
            }
        } );
        
    }
    
    
    private void fillPeople() throws InterruptedException, ExecutionException{
       
        
        CollectionReference docRef = FirebaseConnection.db.collection("users");
        docRef.addSnapshotListener(new EventListener<>(){
            
            @Override
            public void onEvent(QuerySnapshot t, FirestoreException fe) {
                
                userlist.removeAll(userlist);
                
                for(QueryDocumentSnapshot document : t.getDocuments() ){
                    
                    UserFirebaseModel u = new UserFirebaseModel(
                        document.getId(),
                        document.getString("name"),
                        document.getString("email"),
                        document.getString("username"),
                        document.getString("avatar")
                    );
                    
                    
                    userlist.add(u);
                    
                }
                
                fillPeopleList(userlist);
            }
        } );
        
    }
    
        private void fillPeopleList( List<UserFirebaseModel> userlist ){
            listPeople.removeAll();
        for(UserFirebaseModel user : userlist){
            JPanel paneluser = Panels.getPanelPeople(user) ;
            listPeople.add(paneluser);
            listPeople.add(Box.createRigidArea(new Dimension(0, 20)));
        }
        
        listPeople.revalidate();
    }
    
    
    
    public void saveNewMessage(String m){
        JLabel message = Messages.getMyMessage(m);        
        panelChat.add(message);
        panelChat.add(Box.createRigidArea(new Dimension(0,10)));
        txtMessage.setText("");
        panelChat.revalidate();
        scrollToBottom(scrollPanelChat);
    }
    
    public void addOtherMessage(MessageModel m){
        JLabel message = Messages.getOthersMessages(m);
        panelChat.add(message);
        panelChat.add(Box.createRigidArea(new Dimension(0,10)));
        panelChat.revalidate();
        scrollToBottom(scrollPanelChat);
    }
    
    public void callPDF(UserFirebaseModel u){
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                String link = "https://uchat-pdf.codigocorrecto.com/?name=" + u.getName() + "&email="+ u.getEmail() +"&user=" + u.getUsername() + "&uid=" + u.getUid();
                URI url = new URI(link);
                
                Desktop.getDesktop().browse(url);
            } catch (URISyntaxException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        scrollPanelPeople = new javax.swing.JScrollPane();
        listPeople = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        scrollPanelChat = new javax.swing.JScrollPane();
        panelChat = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        avatarLabel = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UChat");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(110, 223, 203));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1220, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, -1, 50));

        scrollPanelPeople.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listPeople.setBackground(new java.awt.Color(255, 255, 255));
        listPeople.setMaximumSize(new java.awt.Dimension(270, 270));

        javax.swing.GroupLayout listPeopleLayout = new javax.swing.GroupLayout(listPeople);
        listPeople.setLayout(listPeopleLayout);
        listPeopleLayout.setHorizontalGroup(
            listPeopleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        listPeopleLayout.setVerticalGroup(
            listPeopleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        scrollPanelPeople.setViewportView(listPeople);

        jPanel3.add(scrollPanelPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 220, 620));

        txtMessage.setColumns(20);
        txtMessage.setLineWrap(true);
        txtMessage.setRows(2);
        txtMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMessageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMessageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMessageKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtMessage);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 660, 50));

        scrollPanelChat.setBorder(null);
        scrollPanelChat.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelChat.setOpaque(false);

        panelChat.setBackground(new java.awt.Color(255, 255, 255));
        panelChat.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 0));

        javax.swing.GroupLayout panelChatLayout = new javax.swing.GroupLayout(panelChat);
        panelChat.setLayout(panelChatLayout);
        panelChatLayout.setHorizontalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        panelChatLayout.setVerticalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        scrollPanelChat.setViewportView(panelChat);

        jPanel3.add(scrollPanelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 740, 560));

        jPanel1.setBackground(new java.awt.Color(55, 73, 97));

        labelUser.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setText("name");

        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("email");

        btnEditar.setLabel("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLogout.setText("Cerrar Sesion");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnEditar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labelUser)
                .addGap(18, 18, 18)
                .addComponent(labelEmail)
                .addGap(26, 26, 26)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(36, 36, 36))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //saveNewMessage(txtMessage.getText());
        
        int response = ChatController.addMessageToChat(txtMessage.getText());
        System.out.println(response);
        
        txtMessage.grabFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageKeyPressed

    private void txtMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageKeyTyped

    private void txtMessageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int response = ChatController.addMessageToChat(txtMessage.getText());
        System.out.println(response);
        
        txtMessage.grabFocus();
        }
    }//GEN-LAST:event_txtMessageKeyReleased

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
        UserFirebase.setUser(null);
        UserFirebase.setPeople( new ArrayList() );
        
        
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        EditAvatar editform = new EditAvatar(this);
        editform.setVisible(true);
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatarLabel;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel listPeople;
    private javax.swing.JPanel panelChat;
    private javax.swing.JScrollPane scrollPanelChat;
    private javax.swing.JScrollPane scrollPanelPeople;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
