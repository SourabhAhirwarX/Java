class X {
    // old method... don't use
    @Deprecated
    void process() {
        System.out.println("hi");
    }

    // new method... try this
    void process(int r) {
        System.out.println("hello");
    }
}

class A {
    public static void main(String[] args) {
        X u = new X();

        u.process();
    }
}