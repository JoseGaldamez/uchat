
package controllers;

import firebase.FirebaseConnection;
import java.util.concurrent.ExecutionException;
import models.UserModel;
import utils.ProcessStates;

/**
 *
 * @author jose_galdamez
 */
public class LoginController {
    
    public static int loginWithUserAndPassword( UserModel user ) throws InterruptedException, ExecutionException{
     
        if (user.getLogin().isEmpty()) {
            return ProcessStates.USER_MISSING;
        }
        
        if (user.getPassword().isEmpty()) {
            return ProcessStates.PASSWORD_MISSING;
        }
        
        int reponse = FirebaseConnection.searchUserByEmailAndPassword(user);
        return reponse;
        
    }
    
    
}
