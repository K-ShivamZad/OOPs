import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculator2 extends JFrame implements ActionListener {
    private JLabel label1, label2, labelResult;
    private JTextField textField1, textField2, textFieldResult;
    private JButton addButton, subButton, mulButton, divButton, clearButton, sqrtButton, factorialButton, squareButton, absButton;

    public Calculator2() {
        label1 = new JLabel("First number");
        label2 = new JLabel("Second number");
        labelResult = new JLabel("Result");
        textField1 = new JTextField();
        textField2 = new JTextField();
        textFieldResult = new JTextField();
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        clearButton = new JButton("Clear");
        sqrtButton = new JButton("Sqrt");
        factorialButton = new JButton("!");
        squareButton = new JButton("x²");
        absButton = new JButton("|x|");

        label1.setBounds(20, 20, 120, 30);
        label2.setBounds(20, 60, 120, 30);
        labelResult.setBounds(20, 100, 120, 30);
        textField1.setBounds(150, 20, 100, 30);
        textField2.setBounds(150, 60, 100, 30);
        textFieldResult.setBounds(150, 100, 100, 30);
        addButton.setBounds(20, 150, 50, 30);
        subButton.setBounds(80, 150, 50, 30);
        mulButton.setBounds(140, 150, 50, 30);
        divButton.setBounds(200, 150, 50, 30);
        clearButton.setBounds(260, 150, 70, 30);
        sqrtButton.setBounds(340, 150, 70, 30);
        factorialButton.setBounds(420, 150, 70, 30);
        squareButton.setBounds(20, 190, 70, 30);
        absButton.setBounds(100, 190, 70, 30);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        clearButton.addActionListener(this);
        sqrtButton.addActionListener(this);
        factorialButton.addActionListener(this);
        squareButton.addActionListener(this);
        absButton.addActionListener(this);

        add(label1);
        add(label2);
        add(labelResult);
        add(textField1);
        add(textField2);
        add(textFieldResult);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(clearButton);
        add(sqrtButton);
        add(factorialButton);
        add(squareButton);
        add(absButton);

        setSize(520, 250);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int n1, n2, result = 0;
        try {
            n1 = Integer.parseInt(textField1.getText());
            n2 = Integer.parseInt(textField2.getText());
        } catch (NumberFormatException ex) {
            textFieldResult.setText("Invalid input");
            return;
        }

        if (e.getSource() == addButton) {
            result = n1 + n2;
        } else if (e.getSource() == subButton) {
            result = n1 - n2;
        } else if (e.getSource() == mulButton) {
            result = n1 * n2;
        } else if (e.getSource() == divButton) {
            if (n2 != 0) {
                result = n1 / n2;
            } else {
                textFieldResult.setText("Cannot divide by zero");
                return;
            }
        } else if (e.getSource() == clearButton) {
            textField1.setText("");
            textField2.setText("");
            textFieldResult.setText("");
            return;
        } else if (e.getSource() == sqrtButton) {
            double sqrtResult = Math.sqrt(n1);
            textFieldResult.setText(String.valueOf(sqrtResult));
            return;
        } else if (e.getSource() == factorialButton) {
            result = calculateFactorial(n1);
        } else if (e.getSource() == squareButton) {
            result = n1 * n1;
        } else if (e.getSource() == absButton) {
            result = Math.abs(n1);
        }

        textFieldResult.setText(String.valueOf(result));
    }

    private int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator2());
    }
}
