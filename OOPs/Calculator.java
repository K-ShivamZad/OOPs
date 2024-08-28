import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    Label f, s, r;
    TextField t1, t2, t3;
    Button add, sub, mul, div;

    Calculator() {
        f = new Label("first number");
        s = new Label("second number");
        r = new Label("result");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        f.setBounds(20, 50, 120, 30);
        s.setBounds(20, 100, 120, 30);
        r.setBounds(20, 150, 120, 30);
        t1.setBounds(150, 50, 80, 30);
        t2.setBounds(150, 100, 80, 30);
        t3.setBounds(150, 150, 80, 30);
        add.setBounds(20, 200, 50, 30);
        sub.setBounds(80, 200, 50, 30);
        mul.setBounds(140, 200, 50, 30);
        div.setBounds(200, 200, 50, 30);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        add(f);
        add(s);
        add(r);
        add(t1);
        add(t2);
        add(t3);
        add(add);
        add(sub);
        add(mul);
        add(div);

        setSize(400, 250);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int result = 0;

        if (e.getSource() == add) {
            result = n1 + n2;
        } else if (e.getSource() == sub) {
            result = n1 - n2;
        } else if (e.getSource() == mul) {
            result = n1 * n2;
        } else if (e.getSource() == div) {
            if (n2 != 0) {
                result = n1 / n2;
            } else {
                t3.setText("Cannot divide by zero");
                return;
            }
        }

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
