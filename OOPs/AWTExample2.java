import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

// class AWTExample2 directly creates an instance of the Frame class
class AWTExample2 
{

    // Constructor
    AWTExample2() 
    {

        // Creating a Frame
        Frame f = new Frame();

        // Creating a Label
        Label l = new Label("Employee id:");

        // Creating a Button
        Button b = new Button("Submit");

        // Creating a TextField
        TextField t = new TextField();

        // Setting the position of the components in the frame
        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);

        // Adding components to the frame
        f.add(b);
        f.add(l);
        f.add(t);

        // Setting the size of the frame
        f.setSize(400, 300);

        // Setting the title of the frame
        f.setTitle("Employee info");

        // Using no layout manager
        f.setLayout(null);

        // Setting the visibility of the frame
        f.setVisible(true);
    }

    // Main method
    public static void main(String args[]) 
    {

        // Creating an instance of the AWTExample2 class
        AWTExample2 awt_obj = new AWTExample2();
    }

}
