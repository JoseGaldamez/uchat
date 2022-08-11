package firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;
import static firebase.FirebaseConnection.db;
import java.util.Map;

/**
 * @author josedev
 */
public class UpdateFirebase {
    
    public static boolean updateImageUser(String uid, String avatar){
        
        try {
            DocumentReference docRef = db.collection("users").document(uid);
            ApiFuture<WriteResult> result = docRef.update("avatar", avatar);
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }        
        
    }
    
    
}
