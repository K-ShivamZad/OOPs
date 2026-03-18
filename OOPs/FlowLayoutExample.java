import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample 
{
    JFrame frameObj;

    FlowLayoutExample() 
    {
        frameObj = new JFrame();

        // Creating ten buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");

        // Adding the buttons to the frame
        frameObj.add(b1);
        frameObj.add(b2);
        frameObj.add(b3);
        frameObj.add(b4);
        frameObj.add(b5);
        frameObj.add(b6);
        frameObj.add(b7);
        frameObj.add(b8);
        frameObj.add(b9);
        frameObj.add(b10);

        // Using FlowLayout with default parameters (center alignment, horizontal and vertical gap of 5 units)
        frameObj.setLayout(new FlowLayout());

        // Set the size of the JFrame
        frameObj.setSize(300, 300);

        // Make the JFrame visible
        frameObj.setVisible(true);
    }

    public static void main(String args[]) 
    {
        new FlowLayoutExample();
    }
}
