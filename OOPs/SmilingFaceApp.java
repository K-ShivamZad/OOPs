import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SmilingFaceApp extends JComponent 
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the face (a yellow circle)
        g2d.setColor(Color.YELLOW);
        Ellipse2D face = new Ellipse2D.Double(50, 50, 200, 200);
        g2d.fill(face);

        // Draw the eyes (two black circles)
        g2d.setColor(Color.BLACK);
        Ellipse2D leftEye = new Ellipse2D.Double(100, 100, 30, 30);
        Ellipse2D rightEye = new Ellipse2D.Double(170, 100, 30, 30);
        g2d.fill(leftEye);
        g2d.fill(rightEye);

        // Draw the smile (an arc)
        Arc2D smile = new Arc2D.Double(100, 140, 100, 60, 0, -180, Arc2D.OPEN);
        g2d.draw(smile);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            JFrame frame = new JFrame("Smiling Face");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new SmilingFaceApp());
            frame.setSize(300, 300);
            frame.setVisible(true);
        });
    }
}
