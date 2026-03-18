import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseHandlingDemo extends JFrame implements MouseListener {
    private JLabel label;

    public MouseHandlingDemo() {
        setTitle("Mouse Handling Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create a label to display mouse events
        label = new JLabel("Move the mouse over the window.");
        add(label, BorderLayout.CENTER);

        // Registering the MouseListener to this JFrame
        addMouseListener(this);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at X: " + e.getX() + ", Y: " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at X: " + e.getX() + ", Y: " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at X: " + e.getX() + ", Y: " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered at X: " + e.getX() + ", Y: " + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited at X: " + e.getX() + ", Y: " + e.getY());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseHandlingDemo demo = new MouseHandlingDemo();
            demo.setVisible(true);
        });
    }
}
