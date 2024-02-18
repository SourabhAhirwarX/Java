class A {
    int size = 88;

    public static void main(String[] args) {
        A x = new A();
        x.info();
        System.out.println(x);
    }

    void info() {
        pro(this);
    }

    static void pro(A e) {
        System.out.println(e);
        // System.out.println(e.size);
    }
}