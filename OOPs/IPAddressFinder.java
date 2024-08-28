import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class IPAddressFinder extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public void UserInterface() {
        setTitle("DataFlair's IP Address Finder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.ORANGE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Create GUI components
        label = new JLabel("Enter URL:");
        textField = new JTextField(20);
        textField.setForeground(Color.BLUE);
        button = new JButton("Locate IP");
        button.setForeground(Color.WHITE);
        button.setBackground(Color.darkGray);
        button.setBorderPainted(false);
        button.setOpaque(true);

        // Set font and alignment for label and button
        Font labelFont = new Font("Arial", Font.BOLD, 12);
        label.setFont(labelFont);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Font buttonFont = new Font("Arial", Font.PLAIN, 12);
        button.setFont(buttonFont);

        setLayout(new FlowLayout());
        add(label);
        add(textField);
        add(button);
    }

    public IPAddressFinder() {
        UserInterface();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String url = textField.getText();
                try {
                    InetAddress add = InetAddress.getByName(url);
                    String ip = add.getHostAddress();
                    JOptionPane.showMessageDialog(null, "IP Address: " + ip);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                IPAddressFinder gui = new IPAddressFinder();
                gui.setVisible(true);
            }
        });
    }
}
