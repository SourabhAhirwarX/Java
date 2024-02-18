class A {
    public void pro() {

    }
}

class B extends A {
    // same or widder acess control should be applied on the overriding method...
    void pro() {

    }
}

// attempting to assign weaker access privileges; was public