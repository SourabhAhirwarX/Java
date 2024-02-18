// method marked as final can not be modified(redefine), i.e. these methods can not be overrided

class X {
    // overriden method
    void pro1() {

    }

    // overriden method
    final void pro2() {

    }
}

class A extends X {
    void pro1() {

    }
    
    // error: pro2() in A cannot override pro2() in X
    // Overridden method is final,
    // you can still access it but you cannot modify(redefine) it...
    void pro2() {

    }
}