class A {
    static final int y;

    A() {
        y = 90;     // error: cannot assign a value to final variable y
    }

    public static void main(String[] args) {
        new A();
        new A();
    }
}