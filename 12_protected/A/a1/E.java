package a1;

import a1.a2.a3.A;

class E extends A {
    public static void main(String[] args) {
        //A x = new A();  // error: t has protected access in A
        E x = new E();
        System.out.println(x.t);
    }
}