package controllers;

import firebase.ChatFirebase;
import firebase.UserFirebase;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import models.MessageModel;

/**
 * @author josedev
 */
public class ChatController {
    
    
    public static int addMessageToChat( String message ){
                
        MessageModel m = new MessageModel( UserFirebase.getUser().getUid(), UserFirebase.getUser().getName(), message );
        int response = ChatFirebase.addMessage(m);
        return response;
    }
    
    
    
}
