class A {
    static int y = 97;

    static void info() {
        System.out.println("Hello");
    }

    static void pro() {
        class B {
            void abc() {
                System.out.println(y);
                info();
            }
        }

        B w = new B();
        w.abc();
    }

    public static void main(String[] args) {
        A t = new A();
        t.pro();
    }
}