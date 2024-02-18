class A {

}

class X extends A {
    X() {
        super(12);      // error: constructor A in class A cannot be applied to given types
    }
} 

// required: no arguments
// found: int
// reason: actual and formal argument lists differ in length