class A {
    private void pro() {

    }
}

class B extends A {
    // OK because, we are assigning a wider access control
    void pro() {

    }
}