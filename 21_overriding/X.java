class A {
    public final static void pro() {

    }
}

class B extends A {
    public static void pro() {

    }
}

// error: pro() in B cannot override pro() in A
// overridden method is static,final