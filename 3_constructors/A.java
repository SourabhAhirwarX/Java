class A {
    // compiler provides a constructor inside a class
    // if there is no constructor defined by the developer

    public static void main(String[] args) {
        new A();
        // we use new keyword to call a constructor
        // constructor is used to create an object
        
        new B();    // error: cannot access B
    }
}