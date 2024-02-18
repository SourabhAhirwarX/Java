class A {
    A() {
        this(13);
        super();        // error: call to super must be first statement in constructor
    }
    
    A(int x) {

    }
}