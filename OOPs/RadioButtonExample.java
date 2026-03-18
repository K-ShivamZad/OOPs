import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample extends JFrame 
{
    private JRadioButton rb1, rb2;
    private JButton b;

    RadioButtonExample() 
    {
        rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 50, 100, 30);
        
        rb2 = new JRadioButton("Female");
        rb2.setBounds(100, 100, 100, 30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        b = new JButton("click");
        b.setBounds(100, 150, 80, 30);
        b.addActionListener(e -> 
        {
            if (rb1.isSelected()) {
                JOptionPane.showMessageDialog(this, "You are Male.");
            }
            if (rb2.isSelected()) {
                JOptionPane.showMessageDialog(this, "You are Female.");
            }
        });
        
        JPanel panel = new JPanel();
        panel.setLayout(null); // You can change the layout manager here
        
        panel.add(rb1);
        panel.add(rb2);
        panel.add(b);
        
        add(panel);
        
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> new RadioButtonExample());
    }
}
