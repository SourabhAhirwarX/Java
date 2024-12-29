package a;

import b.B;

class A {
    public static void main(String[] args) {
        System.out.println(B.t);    // variables declared inside an interface are implicitly public.
    
        // B.t = 3;    // error: cannot assign a value to final variable t
    }
} 