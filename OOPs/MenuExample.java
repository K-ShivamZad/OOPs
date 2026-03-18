import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

class MenuExample 
{
    MenuExample() 
    {
        // Create a frame with a title
        Frame f = new Frame("Menu and MenuItem Example");

        // Create a menu bar
        MenuBar mb = new MenuBar();

        // Create a menu
        Menu menu = new Menu("Menu");

        // Create a submenu
        Menu submenu = new Menu("Sub Menu");

        // Create menu items
        MenuItem i1 = new MenuItem("Item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        MenuItem i4 = new MenuItem("Item 4");
        MenuItem i5 = new MenuItem("Item 5");

        // Add menu items to the menu and submenu
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);

        // Add the menu to the menu bar
        mb.add(menu);

        // Set the menu bar for the frame
        f.setMenuBar(mb);

        // Set the size of the frame
        f.setSize(400, 400);

        // Use a null layout
        f.setLayout(null);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String args[]) 
    {
        // Create an instance of MenuExample, which triggers the creation and display of the frame with the menu.
        new MenuExample();
    }
}
