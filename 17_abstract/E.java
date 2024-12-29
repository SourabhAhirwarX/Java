abstract class X {
    abstract void pro();
}

class A extends X {
    // error: A is not abstract and does not override abstract method pro() in X
}