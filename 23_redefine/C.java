class A {
    void pro() {
        System.out.println(11);
    }
}

class B extends A {
    void pro() {
        System.out.println(22);
    }
}

class X {
    public static void main(String[] args) {
        A y = new B();
        y.pro();
    }
}