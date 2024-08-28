import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Mouse and Key Events Example");

        // Create a label to display mouse/key events
        JLabel label = new JLabel("Move Mouse or Press Key");
        frame.add(label);

        // MouseListener to handle mouse events
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited");
            }
        });

        // KeyListener to handle key events
        label.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyChar());
            }

            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        // Set label focusable to receive key events
        label.setFocusable(true);
        label.requestFocusInWindow();

        // Set frame properties and make it visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
