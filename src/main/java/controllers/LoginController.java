
package controllers;

import firebase.FirebaseConnection;
import java.util.concurrent.ExecutionException;
import models.UserModel;

/**
 *
 * @author jose_galdamez
 */
public class LoginController {
    
    public static boolean loginWithUserAndPassword( UserModel user ) throws InterruptedException, ExecutionException{
        
        boolean login = FirebaseConnection.searchUserByEmailAndPassword(user);
        return login;
        
    }
    
    
    
}
