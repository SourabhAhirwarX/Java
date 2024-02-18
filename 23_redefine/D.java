class A {
    static void pro() {
        System.out.println(110);
    }
}

class B extends A {
    static void pro() {
        System.out.println(220);
    }
}

class X {
    public static void main(String[] args) {
        A y = new B();
        y.pro();
    }
}