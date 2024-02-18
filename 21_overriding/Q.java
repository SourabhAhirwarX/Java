class A {
    void pro() {

    }
}

class B extends A {
    // same or widder acess control should be applied on the overriding method...
    // same
    void pro() {

    }

    // wider
    protected void pro(int a) {

    }

    // wider
    public void pro(float t) {

    }
}