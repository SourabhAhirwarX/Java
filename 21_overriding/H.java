class A {
    void golu(long x) {

    }
}

class B extends A {
    // parameter TYPE mismatch...legal case of method overloading
    // not a legal case of method overriding...because parameter body of
    // overriding method must match with the parameter body of overridden method
    void golu(int x) {

    }
}