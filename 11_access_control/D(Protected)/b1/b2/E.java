package b1.b2;

import a1.a2.a3.A;

class E extends A {
    public static void main(String[] args) {
        E x = new E();
        x.pro();        // public
        // x.info();   // cannot find symbol
        x.info1();     // accessing public_private member

        //error: self() is not public in A; cannot be accessed from outside package
        // x.self();      // accessing Default member

        x.safe();      // accessing protected member
    }
}