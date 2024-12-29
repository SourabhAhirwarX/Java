class A {
    public static void main(String[] args) {
        // Access through instantiation
        B x = new B();
        x.pro();
    }
}

class B {
    int y;
    void pro() {
        System.out.println("Hello");
    }
}