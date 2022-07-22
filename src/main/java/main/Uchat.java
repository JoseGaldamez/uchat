

package main;

import firebase.FirebaseConnection;
import java.io.IOException;

/**
 *
 * @author jose_galdamez
 */
public class Uchat {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {
            FirebaseConnection.connect();
        } catch (IOException e) {
            System.out.println("Algo salió mal durante la conexión.");
        }
    }
}
