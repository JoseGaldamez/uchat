package controllers;

import firebase.UpdateFirebase;
import firebase.UserFirebase;
import javax.swing.JOptionPane;

/**
 * @author josedev
 */
public class UpdateController {
    
    
    public static boolean updateImage(String avatar){
        
        String uid = UserFirebase.getUser().getUid();
        
        try{
            UpdateFirebase.updateImageUser(uid, avatar);
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Algo salio mal actualizando la imagen.");
            return false;
        }
        
    }
    
    
}
