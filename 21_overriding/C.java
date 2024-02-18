class A {
    private void pro() {

    }
}

class B extends A {
    public static void main(String[] args) {
        A x = new A();
        x.pro();       // not OK
    }
}

// error: cannot find symbol