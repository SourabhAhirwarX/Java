class A {
    void pro1() {
        System.out.println("pro1 from A");
    }
}

class B extends A {
    void pro2() {
        System.out.println("pro2 from B");
    }
}

class C extends B {
    void pro3() {
        System.out.println("pro3 from C");
    }
}

class X {
    public static void main(String[] args) {
        C x = new C();

        x.pro3();
        x.pro2();
        x.pro1();
    }
}