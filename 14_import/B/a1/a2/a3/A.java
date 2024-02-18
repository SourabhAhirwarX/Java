package a1.a2.a3;

// import b1.b2.B;
// import b1.b2.C;
// import b1.b2.D;

import b1.b2.*;
// '.*'(Wild card) are for importing all the files in that particular folder

class A {
    public static void main(String[] args) {
        B x = new B();
        C y = new C();
        D z = new D();

        x.pro1();
        y.pro2();
        z.pro3();
    }
}