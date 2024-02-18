class A {
    static void pro() {
        System.out.println("pro in A");
    }
}

class B extends A {
    static void pro() {
        System.out.println("pro in B");
    }
}

class X {
    public static void main(String[] args) {
        //Case 1:
        // A x = new A();

        //Case 2:
        // B x = new B();

        //Case 3:
        A x = new B();

        x.pro();
    }
}