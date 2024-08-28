import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaExample 
{
    TextAreaExample() 
    {
        // Create a frame
        Frame f = new Frame();

        // Create a TextArea and set its initial text
        TextArea area = new TextArea("Welcome to javatpoint");

        // Set the position and size of the TextArea
        area.setBounds(10, 30, 300, 300);

        // Add the TextArea to the frame
        f.add(area);

        // Set the size of the frame
        f.setSize(400, 400);

        // Use a null layout
        f.setLayout(null);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String args[]) 
    {
        // Create an instance of TextAreaExample, which triggers the creation and display of the frame.
        new TextAreaExample();
    }
}
