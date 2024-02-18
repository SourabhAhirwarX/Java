class A {
    static void pro() {

    }
}

class B extends A {
    static int pro() {
        return 1;
    }
}

// error: pro() in B cannot hide pro() in A
// return type int is not compatible with void