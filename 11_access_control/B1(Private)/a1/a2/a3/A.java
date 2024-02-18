package a1.a2.a3;

public class A {
    public void pro() {
        System.out.println("Hello Ji.Public");
    }

    private void info() {
        System.out.println("Hello Ji.Private");
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();    // calling public member
        x.info();   // calling private member
    }
}

// private members were only accessible inside the same class