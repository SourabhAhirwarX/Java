class A {
    A(int x) {
        this();
    }
    
    A() {               // error: recursive constructor invocation
        this(12);
    }
}