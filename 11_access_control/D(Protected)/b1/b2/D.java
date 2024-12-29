package b1.b2;

import a1.a2.a3.A;

class D {
    public static void main(String[] args) {
        A x = new A();
        x.pro();
        // x.info();   // error: info() has private access in A
        x.info1();     // accessing private member
        
        // error: self() is not public in A; cannot be accessed from outside package
        x.self();      // accessing Default member

        // error: safe() has protected access in A x.safe();
        x.safe();      // accessing protected member
    }
}