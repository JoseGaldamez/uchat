
package firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
    
   

}
