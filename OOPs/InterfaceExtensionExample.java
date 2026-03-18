// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2 extending Interface1
interface Interface2 extends Interface1 {
    void method2();
}

// Class implementing Interface2
class MyClass implements Interface2 {
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class InterfaceExtensionExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Calling methods from Interface1 and Interface2
        obj.method1();
        obj.method2();
    }
}
