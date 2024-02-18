class A {
    A() {
        super();
        this(17);       // error: call to this must be first statement in constructor
    }

    A(int x) {

    }
}