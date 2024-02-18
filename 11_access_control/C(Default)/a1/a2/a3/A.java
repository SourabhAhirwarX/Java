package a1.a2.a3;

public class A {
    public void pro() {
        System.out.println("Hello Ji.Public");
    }

    private void info() {
        System.out.println("Hello Ji.Private");
        // classes in other source file,
        // error: info() has private access in A
    }

    public void info1() {
        info();     // accessing private member
        System.out.println("Hello Ji.Private_Public");
    }

    void self() {
        System.out.println("Hello Ji.Default");
        // Default member
        // class in other package file,
        // error: self() is not public in A; cannot be accessed from outside package
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();       // calling public member
        x.info();      // calling private member
        x.info1();     // accessing public private member
        x.self();      // accessing default member
    }
}