package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import models.UserFirebaseModel;
import views.PrincipalView;

/**
 * @author josedev
 */
public class Panels {

    public static JPanel getPanelPeople(UserFirebaseModel user) {

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new MatteBorder(0, 2, 0, 0, Color.GREEN));
        panel.setMaximumSize(new Dimension(250, 50));

        String name = user.getName();
        JLabel lname = new JLabel(name);
        lname.setBorder(new EmptyBorder(5, 5, 0, 0));
        lname.setOpaque(true);
        lname.setFont(new Font("Serif", Font.BOLD, 14));

        String username = user.getUsername();
        JLabel lusername = new JLabel(username);
        lusername.setBorder(new EmptyBorder(5, 5, 0, 0));
        lusername.setOpaque(true);
        lusername.setFont(new Font("Serif", Font.ITALIC, 10));

        panel.add(lname);
        panel.add(lusername);

        panel.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                String partName = getNameUser(user.getName());
                String partLastname = getLastnameUser(user.getName());
                
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        
                        String link = "https://uchat-pdf.codigocorrecto.com/?name="
                                + partName +"&lastname=" + partLastname + "&email=" 
                                + user.getEmail() + "&user=" + user.getUsername() 
                                + "&uid=" + user.getUid();
                        
                        URI url = new URI(link);

                        Desktop.getDesktop().browse(url);
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                System.out.println("Hola pressed");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });

        return panel;
    }
    
    private static String getNameUser(String fullName){
        String[] partNames = fullName.split(" ", 2);
        return partNames[0];
    }
    
    private static String getLastnameUser(String fullName){
        String[] partNames = fullName.split(" ", 3);
        if (partNames.length > 1) {
            return partNames[1];
        }
        return "---";
    }

}
