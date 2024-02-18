class A {
    private A() {

    }
}

class X {
    public static void main(String[] args) {
        A x = new A();         // error: A() has private access in A
    }
}