class A {
    // overridden method
    int pro() {
        return 1;
    }
}

class B extends A {
    // overriding method
    // return type of overriding method must be same
    // primitive type which is declared with the overridden method...
    // method definition can be changed accordingly
    int pro() {
        return 2;
    }
}