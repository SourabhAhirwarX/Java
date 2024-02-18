class A {
    A() {
        this();     // error: recursive constructor invocation
    }
}