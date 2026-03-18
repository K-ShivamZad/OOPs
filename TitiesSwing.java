import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TitiesSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        int[] x = { 500, 600, 500 };
        int[] y = { 500, 500, 600 };
        g.fillPolygon(x, y, 3); // Draw a filled triangle
        g.setColor(Color.RED); // Change color to red for rectangle
        g.fillRect(100, 100, 400, 400); // Draw filled rectangle
        g.setColor(Color.BLACK); // Change color to black for rectangle border
        g.drawRect(100, 100, 400, 400); // Draw rectangle border
        g.setColor(Color.YELLOW); // Change color to yellow
        g.drawLine(100, 100, 500, 500); // Draw a line
        g.drawArc(100, 100, 800, 810, 180, -90); // Draw an arc
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tities Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(new TitiesSwing());
        frame.setVisible(true);
    }
}
