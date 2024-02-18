/*
    Constructor: constructors are just like the methods having body but with no return type and are used for object creation (i.e. instantiation).
    constructor name must be same as the class name and without return type.
    can create multiple constructors
*/

class A {
    // compiler provides a constructor(i.e. the default constructor) inside every class
    // if there is no constructor defined by the developer

    public static void main(String[] args) {
        new A();
        // we use new keyword to call a constructor
        // constructor was used for creating objects
        
        new B();    // error: cannot access B, constructor name must be same as class name
    }
}