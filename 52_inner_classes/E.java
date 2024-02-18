class A {
    int y = 23;

    class Z {

    }

    void pro() {
        System.out.println(y);
        info();
        Z z = new Z();      // we can access an instance member class from instance level method 
        System.out.println(z);
    }

    void info() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        A x = new A();
        x.pro();

        System.out.println("Bye");
    }
}