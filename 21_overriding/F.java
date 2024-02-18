class A {
    void pro() {

    }
}

class B extends A {
    // parameter COUNT mismatch...legal case of method overloading
    // not a legal case of method overriding...because parameter body of
    // overriding method must match with the parameter body of overridden method
    void pro(int y) {

    }
}