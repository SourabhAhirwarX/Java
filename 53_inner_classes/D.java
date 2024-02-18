class A {
    private float j = 34.23f;

    Z t = new Z() {
        void pro() {
            System.out.println(j);
        }
    };

    public static void main(String[] args) {
        A a = new A();
        a.t.pro();

        // Z y = new Z();
        // y.pro();
    }
}

class Z {
    void pro() {
        System.out.println("golu");
    }
}