import java.awt.*;
import java.awt.event.*;

class PopupMenuExample 
{
    PopupMenuExample() 
    {
        // Create a frame with a title
        final Frame f = new Frame("PopupMenu Example");

        // Create a popup menu with the label "Edit"
        final PopupMenu popupmenu = new PopupMenu("Edit");

        // Create menu items for Cut, Copy, and Paste
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        // Add menu items to the popup menu
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        // Add a mouse listener to the frame to display the popup menu on a mouse click
        f.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                popupmenu.show(f, e.getX(), e.getY());
            }
        });

        // Add the popup menu to the frame
        f.add(popupmenu);

        // Set the size, layout (null layout), and visibility of the frame
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) 
    {
        // Create an instance of PopupMenuExample, which triggers the creation and display of the frame with the popup menu.
        new PopupMenuExample();
    }
}
