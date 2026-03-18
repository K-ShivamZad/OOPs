// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

// Class implementing multiple interfaces
class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Calling methods from both interfaces
        obj.method1();
        obj.method2();
    }
}
