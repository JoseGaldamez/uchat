package utils;
import javax.swing.ImageIcon;

/**
 *
 * @author jose_galdamez
 */
public class ImagesOfProject {
    public static String URL_BASE = "./src/main/java/assets/";
    public static String LOGO = "uchat.png";
    public static String PEOPLE = "people.png";

    
    public static ImageIcon getLogoBack(){
        return new ImageIcon(URL_BASE + LOGO);
    }
    
    public static ImageIcon getPeople(){
        return new ImageIcon(URL_BASE + PEOPLE);
    }
    
}
