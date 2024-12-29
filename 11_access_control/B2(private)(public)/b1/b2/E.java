package b1.b2;

import a1.a2.a3.A;

class E extends A {
    public static void main(String[] args) {
        E x = new E();
        x.pro();
        // x.info();   // cannot find symbol
        x.info1();     // accessing private member
    }
}