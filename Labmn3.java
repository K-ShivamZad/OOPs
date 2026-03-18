import java.util.ArrayList;
import java.util.List;

// Component interface
interface Component {
    void operation();
}

// Leaf class
class Leaf implements Component {
    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf: " + name);
    }
}

// Composite class
class Composite implements Component {
    private final List<Component> children = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Composite:");
        for (Component child : children) {
            child.operation();
        }
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
}

// Main class to test the Composite pattern
public class Labmn3 {
    public static void main(String[] args) {
        // Create leaf objects
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        
        // Create composite object
        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);
        
        // Create another composite object
        Composite composite2 = new Composite();
        composite2.add(new Leaf("Leaf 3"));
        composite2.add(new Leaf("Leaf 4"));
        
        // Add composite2 to composite
        composite.add(composite2);
        
        // Perform operation
        composite.operation();
    }
}
