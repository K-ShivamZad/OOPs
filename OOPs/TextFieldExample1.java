import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldExample1 
{
    public static void main(String args[]) 
    {
        Frame f = new Frame("TextField Example");
        TextField t1, t2;
        t1 = new TextField("Welcome to Javatpoint.");
        t1.setBounds(50, 100, 200, 30);
        t2 = new TextField("AWT Tutorial");
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        // Add a window listener to handle window close event
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                f.dispose(); // Close the frame and release its resources
            }
        });
    }
}
