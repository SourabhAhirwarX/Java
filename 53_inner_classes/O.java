class A {
    int y = 9;

    void info() {
        System.out.println("Hi");
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