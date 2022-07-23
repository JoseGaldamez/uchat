

package main;

import firebase.FirebaseConnection;
import java.io.IOException;
import views.Login;

/**
 *
 * @author jose_galdamez
 */
public class Uchat {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {
            FirebaseConnection.connect();
            Login login = new Login();
            login.setVisible(true);
        } catch (IOException e) {
            System.out.println("Algo salió mal durante la conexión.");
            System.out.println("Hola mundo...");
        }
    }
}
