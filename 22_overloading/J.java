abstract class A {
    void pro(double e) {

    }

    static void pro(float e) {

    }

    abstract void pro(int e);
}

//parameter mismatch: a legal case of method overloading, even though one of them is static and the other non static
// abstrct also allowded in overloading
// 1. access modifiers
// 2. static
// 3. abstract