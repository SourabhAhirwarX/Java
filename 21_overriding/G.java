class A {
    void golu(int x, float y) {

    }
}

class B extends A {
    // parameter SEQUENCE mismatch...legal case of method overloading
    // not a legal case of method overriding...because parameter body of
    // overriding method must match with the parameter body of overridden method
    void golu(float y, int x) {

    }
}