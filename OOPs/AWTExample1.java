// importing Java AWT class
import java.awt.Button;
import java.awt.Frame;

// extending Frame class to our class AWTExample1
public class AWTExample1 extends Frame 
{

    // Constructor
    AWTExample1() 
    {

        // Creating a button
        Button b = new Button("Click Me!!");

        // Setting button position on the screen
        b.setBounds(30, 100, 80, 30);

        // Adding the button to the frame
        add(b);

        // Frame size: 300 width and 300 height
        setSize(300, 300);

        // Setting the title of the Frame
        setTitle("This is our basic AWT example");

        // No layout manager (null layout)
        setLayout(null);

        // Making the frame visible; by default, it's not visible
        setVisible(true);
    }

    // Main method
    public static void main(String args[]) 
    {

        // Creating an instance of the AWTExample1 class
        AWTExample1 f = new AWTExample1();
    }
}
