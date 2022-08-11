package utils;
import javax.swing.ImageIcon;

/**
 *
 * @author jose_galdamez
 */
public class ImagesOfProject {
    private static String URL_BASE = "./src/main/java/assets/";
    
    private static String LOGO = "uchat.png";
    private static String PEOPLE = "people.png";
    private static String CHAT_BACKGROUND = "chat_background.png";
    

    
    public static ImageIcon getLogoBack(){
        return new ImageIcon(URL_BASE + LOGO);
    }
    
    public static ImageIcon getPeople(){
        return new ImageIcon(URL_BASE + PEOPLE);
    }
    
    public static ImageIcon getChatBackground(){
        return new ImageIcon(URL_BASE + CHAT_BACKGROUND);
    }
    
    public static ImageIcon getAvatar(String nameImage){
        return new ImageIcon(URL_BASE + nameImage);
    }
    
}
