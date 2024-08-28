import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border 
{
    JFrame f;

    Border() 
    {
        f = new JFrame();

        // Creating buttons
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

        // Adding buttons to the JFrame with BorderLayout constraints
        f.add(b1, BorderLayout.NORTH); // Place b1 in the North direction
        f.add(b2, BorderLayout.SOUTH); // Place b2 in the South direction
        f.add(b3, BorderLayout.EAST);  // Place b3 in the East direction
        f.add(b4, BorderLayout.WEST);  // Place b4 in the West direction
        f.add(b5, BorderLayout.CENTER); // Place b5 in the Center

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) 
    {
        new Border();
    }
}
