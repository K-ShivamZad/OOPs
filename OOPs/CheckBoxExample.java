import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxExample 
{
    CheckBoxExample() 
    {
        JFrame f = new JFrame("CheckBox Example");

        // Create two JCheckBox components
        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 50, 50);

        JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100, 150, 50, 50);

        // Add the JCheckBox components to the JFrame
        f.add(checkBox1);
        f.add(checkBox2);

        // Set the size of the JFrame
        f.setSize(400, 400);

        // Use a null layout
        f.setLayout(null);

        // Make the JFrame visible
        f.setVisible(true);
    }

    public static void main(String args[]) 
    {
        new CheckBoxExample();
    }
}
