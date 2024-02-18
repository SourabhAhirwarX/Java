class A {
    private void pro() {

    }
}

class B extends A {
    // here we are not using overriding concept, because the parent class method version is private
    // the first condition says that the method must be inheritable to child and non final
    // this is just a coincidence that the child defined a method with the same name...
    int pro() {
        return 14;
    }
}