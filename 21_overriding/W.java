class A {
    public static void pro() {

    }
}

class B extends A {
    static void pro() {

    }
}

// error: pro() in B cannot override pro() in A
// attempting to assign weaker access privileges; was public