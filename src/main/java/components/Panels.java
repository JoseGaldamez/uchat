package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import models.UserFirebaseModel;

/**
 * @author josedev
 */
public class Panels {
    
    public static JPanel getPanelPeople( UserFirebaseModel user ) {
            
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout( panel, BoxLayout.Y_AXIS) );
        panel.setBorder(new MatteBorder(0, 2, 0, 0, Color.GREEN ));
        panel.setMaximumSize(new Dimension(250, 50));
        
            String name = user.getName();
            JLabel lname = new JLabel(name);
            lname.setBorder(new EmptyBorder(5,5,0,0));
            lname.setOpaque(true);          
            lname.setFont(new Font("Serif", Font.BOLD, 14));
            
            String username = user.getUsername();
            JLabel lusername = new JLabel(username);
            lusername.setBorder(new EmptyBorder(5,5,0,0));
            lusername.setOpaque(true);
            lusername.setFont(new Font("Serif", Font.ITALIC, 10));
            
            panel.add(lname);
            panel.add(lusername);
        
            return panel;
    }
    
    
    
    
}
