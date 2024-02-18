class A {
    A() {
        super(); this();     // error: call to this must be first statement in constructor
    }

    A(int x) {

    }
}