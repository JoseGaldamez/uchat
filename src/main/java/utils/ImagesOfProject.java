package utils;
import javax.swing.ImageIcon;

/**
 *
 * @author jose_galdamez
 */
public class ImagesOfProject {
    public static String LOGO = ".\\src\\main\\java\\assets\\uchat.png";
    public static String PEOPLE = ".\\src\\main\\java\\assets\\people.png";

    
    public static ImageIcon getLogoBack(){
        return new ImageIcon(LOGO);
    }
    
    public static ImageIcon getPeople(){
        return new ImageIcon(PEOPLE);
    }
    
}
