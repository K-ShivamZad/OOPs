import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCharCounter extends JFrame {
    private JTextArea textArea1, textArea2;
    private JLabel label1, label2;
    private JButton countButton;

    public WordCharCounter() {
        setTitle("Word and Character Counter");
        setLayout(null);

        label1 = new JLabel("Text Area 1:");
        label1.setBounds(10, 10, 100, 20);
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setBounds(10, 30, 250, 100);
        add(textArea1);

        label2 = new JLabel("Text Area 2:");
        label2.setBounds(10, 140, 100, 20);
        add(label2);

        textArea2 = new JTextArea();
        textArea2.setBounds(10, 160, 250, 100);
        add(textArea2);

        countButton = new JButton("Count Words and Characters");
        countButton.setBounds(10, 280, 200, 30);
        add(countButton);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(10, 320, 300, 20);
        add(resultLabel);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textArea1.getText();
                String text2 = textArea2.getText();

                int totalWords = countWords(text1) + countWords(text2);
                int totalChars = text1.length() + text2.length();

                resultLabel.setText("Total Words: " + totalWords + ", Total Characters: " + totalChars);
            }
        });

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private int countWords(String text) {
        String trimmedText = text.trim();
        if (trimmedText.isEmpty()) {
            return 0;
        }
        return trimmedText.split("\\s+").length;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WordCharCounter();
            }
        });
    }
}
