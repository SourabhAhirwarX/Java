class A {
    static int y = 900;

    static void pro() {
        System.out.println("~~~~~~~");
    }

    class B {
        void info() {
            System.out.println(y);
            pro();
        }
    }

    public static void main(String[] args) {
        A x = new A();
        B y = x.new B();

        y.info();
    }
}