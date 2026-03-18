import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class SimpleCalculatorGUI extends JFrame {
    private JTextField displayField;
    private JPanel buttonPanel;

    private double num1 = 0.0;
    private String operator = "";
    private boolean startNewInput = true;

    public SimpleCalculatorGUI() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        displayField = new JTextField(12);
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.BOLD, 24));

        buttonPanel = new JPanel(new GridLayout(4, 4));

        addButton("7");
        addButton("8");
        addButton("9");
        addButton("/");
        addButton("4");
        addButton("5");
        addButton("6");
        addButton("*");
        addButton("1");
        addButton("2");
        addButton("3");
        addButton("-");
        addButton("0");
        addButton("C");
        addButton("=");
        addButton("+");

        Container contentPane = getContentPane();
        contentPane.add(displayField, BorderLayout.NORTH);
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        pack();
        setLocationByPlatform(true);
        setVisible(true);
    }

    private void addButton(String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        buttonPanel.add(button);
        button.addActionListener(e -> onButtonClick(label));
    }

    private void onButtonClick(String label) {
        if (label.matches("[0-9]")) {
            if (startNewInput) {
                displayField.setText(label);
                startNewInput = false;
            } else {
                displayField.setText(displayField.getText() + label);
            }
        } else if ("C".equals(label)) {
            displayField.setText("");
            num1 = 0.0;
            operator = "";
            startNewInput = true;
        } else if ("=".equals(label)) {
            performOperation();
        } else {
            if (!operator.isEmpty()) {
                performOperation();
            }
            operator = label;
            num1 = Double.parseDouble(displayField.getText());
            startNewInput = true;
        }
    }

    private void performOperation() {
        double num2 = Double.parseDouble(displayField.getText());
        switch (operator) {
            case "+":
                num1 += num2;
                break;
            case "-":
                num1 -= num2;
                break;
            case "*":
                num1 *= num2;
                break;
            case "/":
                if (num2 != 0) {
                    num1 /= num2;
                } else {
                    displayField.setText("Error");
                    return;
                }
                break;
        }
        displayField.setText(String.valueOf(num1));
        operator = "";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculatorGUI::new);
    }
}
