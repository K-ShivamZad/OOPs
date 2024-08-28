import java.util.Scanner;
55
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber;

        do {
            System.out.println("Guess my number (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

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

            } else {
                System.out.println("Your number is too small");
            }
        } while (userNumber != myNumber); // Changed loop condition to stop when the user's guess is correct

        System.out.print("My number was: ");
        System.out.println(myNumber);
    }
}
