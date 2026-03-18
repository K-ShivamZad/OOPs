import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ButtonLevelDisplay {
    private int level = 0; // Initialize the level to 0

    public ButtonLevelDisplay() {
        // Create a JFrame
        JFrame frame = new JFrame("Button Level Display");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a label to display the level
        JLabel levelLabel = new JLabel("Level: " + level);

        // Create a button
        JButton button = new JButton("Press Me");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                level++; // Increment the level when the button is pressed
                levelLabel.setText("Level: " + level); // Update the label text
            }
        });

        // Add components to the panel
        panel.add(levelLabel);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonLevelDisplay();
            }
        });
    }
}
