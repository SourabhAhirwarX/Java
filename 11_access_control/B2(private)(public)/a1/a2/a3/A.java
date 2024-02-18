package a1.a2.a3;

public class A {
    public void pro() {
        System.out.println("Hello Ji.Public");
    }

    private void info() {
        System.out.println("Hello Ji.Private");
    }

    public void info1() {
        info();     // accessing private member
        System.out.println("Hello Ji.Private_Public");
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();       // calling public member
        x.info();      // calling private member
        x.info1();     // accessing private member
    }
}