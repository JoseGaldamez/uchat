package firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.EventListener;
import com.google.cloud.firestore.FirestoreException;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.database.annotations.Nullable;
import static firebase.FirebaseConnection.db;
import io.grpc.LoadBalancerRegistry;
import io.grpc.internal.PickFirstLoadBalancerProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import models.MessageModel;
import utils.ProcessStates;

/**
 * @author josedev
 */
public class ChatFirebase {
    
    private static List<MessageModel> chats = new ArrayList<>();
    
    public static int addMessage( MessageModel message ){
        
        LoadBalancerRegistry.getDefaultRegistry().register(new PickFirstLoadBalancerProvider());
        
        Map<String, Object> data = new HashMap<>();
        
        data.put("uid", message.getUid() );
        data.put("user", message.getUser() );
        data.put("text", message.getText() );
        
        Date date = new Date();
        String documentID = String.valueOf(date.getTime());
        
        boolean response = FirebaseConnection.insert("chats", documentID, data);
        
        if(response){
            return ProcessStates.OK;
        } else {
            return ProcessStates.ERROR;
        }
        
    }
    
    
}
