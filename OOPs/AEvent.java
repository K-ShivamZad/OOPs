import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEvent extends Frame implements ActionListener 
{
    TextField tf;

    AEvent() 
    {
        // Create components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        // Register the ActionListener (this) for the button
        b.addActionListener(this); // Passing the current instance

        // Add components and set size, layout, and visibility
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        // This method is called when the button is clicked
        tf.setText("Welcome");
    }

    public static void main(String args[]) 
    {
        new AEvent();
    }
}
