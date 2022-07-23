
package firebase;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import models.UserModel;

/**
 * @author jose_galdamez
 */
public class FirebaseConnection {
    
    static Firestore db;
    
    public static void connect() throws FileNotFoundException, IOException{
         FileInputStream serviceAccount =
        new FileInputStream("uth-chat-firebase.json");

      FirebaseOptions options = new FirebaseOptions.Builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .build();

      FirebaseApp.initializeApp(options);
      
      db = FirestoreClient.getFirestore();
        System.out.println("Conexión exitosa");
    }
    
    public static boolean insert(String collection, String document, Map<String, Object> data ){
        try {
            DocumentReference docRef = db.collection(collection).document(document);
            ApiFuture<WriteResult> result = docRef.set(data);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        
    }
    
    public static boolean searchUserByEmailAndPassword( UserModel user ) throws InterruptedException, ExecutionException {
        
        CollectionReference collectionReference = db.collection("users");
        ApiFuture<QuerySnapshot> result = collectionReference.get();
        boolean response = false;
        for (DocumentSnapshot document : result.get().getDocuments()) {
            System.out.println(document);
            
            if (document.getString("email").equals(user.getLogin()) ) {
                if (document.getString("password").equals(user.getPassword())) {
                    response = true;    
                }
            }
            
            if (document.getString("username").equals(user.getLogin()) ) {
                if (document.getString("password").equals(user.getPassword())) {
                    response = true;    
                }
            }
            
        }
        
        return response;

    }
    
   

}
