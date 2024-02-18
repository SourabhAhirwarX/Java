class A {
    void pro() {

    }
}

class B extends A {
    static void pro() {

    }
}

// error: pro() in B cannot override pro() in A
// overriding method is static