class A {
    void pro() {
        System.out.println("pro in parent A");
    }
}

class B extends A {
    void info() {
        System.out.println("info in child B");
    }
}

class X {
    public static void main(String[] args) {
        A x = new B();
        System.out.println(x.toString());
        x.pro();
        // x.info();    // error: cannot find symbol

        B t = (B) x;
        t.info();
    }
}