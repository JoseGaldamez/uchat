
package controllers;

import firebase.FirebaseConnection;
import firebase.UserFirebase;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import models.RegisterModel;
import utils.ProcessStates;

/**
 *
 * @author jose_galdamez
 */
public class RegisterController {
    
    public static boolean registerUser(RegisterModel user) throws InterruptedException, ExecutionException{
        
        if (user.getName().trim().equals("") || user.getEmail().trim().equals("") || user.getUsername().trim().equals("") || user.getPassword().trim().equals("") ) {
            return false;
        }
        
        
        if ( UserFirebase.searchUserByEmailAndUserName(user.getEmail(), user.getUsername()) ) {
            return false;
        }
        
        
        Map<String, Object> data = new HashMap<>();
        data.put("name", user.getName());
        data.put("email", user.getEmail());
        data.put("username", user.getUsername());
        data.put("password", user.getPassword());
        
        String document = UUID.randomUUID().toString();
        
        boolean response = FirebaseConnection.insert("users", document, data);
        
        return response;
    }
    
}
