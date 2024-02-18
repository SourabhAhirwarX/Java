abstract class X {
    abstract void pro();
}

class A extends X {
    // error: A is not abstract and does not override abstract method pro() in X
    // so it is compulsory to the child class to override the abstract method of the abstract class
}