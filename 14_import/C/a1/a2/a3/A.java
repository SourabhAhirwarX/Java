package a1.a2.a3;

import b1.*;
import b1.b2.B;

class A {
    public static void main(String[] args) {
        D x = new D();
        C y = new C();

        B z = new B();

        z.pro1();
        y.pro2();
        x.pro3();
    }
}