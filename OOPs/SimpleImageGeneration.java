import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SimpleImageGeneration 
{

    public static void main(String[] args) {
        int width = 800;  // Width of the image
        int height = 600; // Height of the image

        // Create a BufferedImage to draw on
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Create a Graphics2D object for drawing on the image
        Graphics2D g2d = image.createGraphics();

        // Fill the image with a blue rectangle
        g2d.setColor(Color.RED);
        g2d.fillRect(100, 100, 600, 400);

        // Add text to the image
        g2d.setColor(Color.GREEN);
        g2d.setFont(new Font("Arial", Font.BOLD, 36));
        g2d.drawString("Simple Image", 300, 300);

        // Dispose of the Graphics2D object
        g2d.dispose();

        // Save the image to a file
        try {
            File outputImage = new File("output_image.png");
            ImageIO.write(image, "png", outputImage);
            System.out.println("Image saved as " + outputImage.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a JFrame to display the image (optional)
        JFrame frame = new JFrame("Generated Image");
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
