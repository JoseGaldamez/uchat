

package main;

import firebase.FirebaseConnection;
import java.io.IOException;
import views.Login;
//import views.PrincipalView;

/**
 * @author jose_galdamez
 */
public class Uchat {

    public static void main(String[] args) {
        try {
            FirebaseConnection.connect();
            Login login = new Login();
            login.setVisible(true);
            
            //PrincipalView principal = new PrincipalView();
            //principal.setVisible(true);
        } catch (IOException e) {
            System.out.println("Algo salió mal durante la conexión.");
        }
    }
}
