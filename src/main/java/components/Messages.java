
package components;

import firebase.UserFirebase;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author josedev
 */
public class Messages {
    
    public static JLabel getMyMessage(String text){
            String message = String.format("<html><div style='background-color:white; padding:10px;' WIDTH=%d><FONT COLOR=RED SIZE=1.2>%s</FONT><br/>%s</div></html>", 500, UserFirebase.getUser().getName(), text);
            JLabel lmessage = new JLabel(message, SwingConstants.RIGHT);
            lmessage.setBorder(new EmptyBorder(15,15,15,15));
            return lmessage;
    }
    
}
