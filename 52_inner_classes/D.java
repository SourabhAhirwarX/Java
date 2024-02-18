class A {
    class X {

    }

    public static void main(String[] args) {
        A a = new A();

        // X x = new X();    // NOT OK
        X x = a.new X();
        System.out.println(x);

        A.X y = a.new X();
        System.out.println(y);
    }
}