class A {
    final void pro() {

    }
}

class B extends A {
    void pro() {

    }
}

// error: pro() in B cannot override pro() in A
// overridden method is final