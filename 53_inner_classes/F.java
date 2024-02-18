class A {
    private static float j = 7.23f;

    Z t = new Z() {
        void pro() {
            System.out.println(j);
        }

        void info() {
            System.out.println("prithviraj");
        }
    };

    public static void main(String[] args) {
        A a = new A();
        a.t.pro();
        a.t.info();

        // Z y = new Z();
        // y.pro();
    }
}

class Z {
    void pro() {
        System.out.println("golu");
    }
}