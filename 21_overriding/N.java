class A {
    void pro() {

    }
}

class B extends A {
    int pro() {
        return 12;
    }
}

// error: pro() in B cannot override pro() in A
// return type int is not compatible with void