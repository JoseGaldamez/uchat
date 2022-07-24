
package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import views.Login;

/**
 *
 * @author jose_galdamez
 */
public class ImagesOfProyect {
    public static String LOGO_BLACK = "https://firebasestorage.googleapis.com/v0/b/uth-chat.appspot.com/o/assets%2Flogo2.png?alt=media&token=32d278f1-a2e0-445e-990d-180bb5ad8327";

    
    public static ImageIcon getLogoBack(){
        try {
            URL url = new URL( LOGO_BLACK );
            try {
                Image image = ImageIO.read(url);
                ImageIcon logo = new ImageIcon(image);
                return logo;
                
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
