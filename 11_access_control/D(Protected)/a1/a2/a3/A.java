package a1.a2.a3;

public class A {
    public void pro() {
        System.out.println("Hello Ji. Public");
    }

    private void info() {
        System.out.println("Hello Ji. Private");
        // classes in other source file,
        // error: info() has private access in A
    }

    public void info1() {
        info();     // accessing private member
        System.out.println("Hello Ji. Private_Public");
    }

    void self() {
        System.out.println("Hello Ji. Default");
        // Default member
        // class in other package file,
        // error: self() is not public in A; cannot be accessed from outside package
    }

    protected void safe() {
        System.out.println("Hello Ji. Protected");
        // protected memeber
        // accessible by instantaneous class, child class, same file(package)
        // not accessible by non instance(non child class) file of another package 
        // error: safe() has protected access in A x.safe();
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();       // calling public member
        x.info();      // calling private member
        x.info1();     // accessing private member through public member
        x.self();      // accessing Default member
        x.safe();      // accessing protected member
    }
}