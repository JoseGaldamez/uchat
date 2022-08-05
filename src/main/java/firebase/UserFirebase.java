package firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import static firebase.FirebaseConnection.db;
import io.grpc.LoadBalancerRegistry;
import io.grpc.internal.PickFirstLoadBalancerProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import models.UserFirebaseModel;
import models.UserModel;
import utils.ProcessStates;

/**
 * @author josedev
 */

public class UserFirebase {
    private static UserFirebaseModel user = null;
    private static List<UserFirebaseModel> people = new ArrayList<>();

    public static UserFirebaseModel getUser() {
        return user;
    }

    public static void setUser(UserFirebaseModel u) {
        user = u;
    }

    public static List<UserFirebaseModel> getPeople() {
        return people;
    }
    
    public static int searchUserByEmailAndPassword( UserModel user ) throws InterruptedException, ExecutionException {
        
        LoadBalancerRegistry.getDefaultRegistry().register(new PickFirstLoadBalancerProvider());
        
        CollectionReference collectionReference = db.collection("users");
        ApiFuture<QuerySnapshot> result = collectionReference.get();
        
        int response = ProcessStates.NOT_FOUND;
        
        for (DocumentSnapshot document : result.get().getDocuments()) {
            
            UserFirebaseModel u = new UserFirebaseModel(
                        document.getId(),
                        document.getString("name"),
                        document.getString("email"),
                        document.getString("username"),
                        "none" );
            
            if (document.getString("email").equals(user.getLogin()) ) {
                if (document.getString("password").equals(user.getPassword())) {
                    response = ProcessStates.OK;
                    UserFirebase.setUser(u);
                }
            }
            
            if (document.getString("username").equals(user.getLogin()) ) {
                if (document.getString("password").equals(user.getPassword())) {
                    response = ProcessStates.OK;
                    UserFirebase.setUser(u);
                }
            }
            
            people.add(u);
            
        }
        
        if(response == ProcessStates.OK){
            people.remove(UserFirebase.getUser());
        }
        
        if(response == ProcessStates.NOT_FOUND ){
            people.removeAll(people);
        }
        
        return response;

    }
    
        public static boolean searchUserByEmailAndUserName( String email, String username ) throws InterruptedException, ExecutionException {
             
        CollectionReference collectionReference = db.collection("users");
        ApiFuture<QuerySnapshot> result = collectionReference.get();
        boolean response = false;
        
        for (DocumentSnapshot document : result.get().getDocuments()) {
            
            if (document.getString("email").equals(email) ) {
                response = true;
            }
            
            if (document.getString("username").equals(username) ) {
                response = true;
            }
            
        }
        
        return response;
    }

    
}
