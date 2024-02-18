class C {
    C() {
        System.out.println("Constructor C");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor B");
    }
}

class A extends C {
    A() {
        System.out.println("Constructor A");
    }
}

class X {
    public static void main(String[] args) {
        new B();
    }
}