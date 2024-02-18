class A {
    class B {

    }

    public static void main(String[] args) {
        A x = new A();

        A y = x.new B();        // Not Ok
        B z = x.new B();        // Ok
    }
}