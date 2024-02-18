class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B(int a) {
        System.out.println(a);
    }
    B() {
        this(12);
        System.out.println("B");
    }

    public static void main(String[] args) {
        B x = new B();
    }
}