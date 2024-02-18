abstract class A {
    abstract void pro(); 
}

class B extends A {
    // forced contract... child must define an incomplete(abstract) method of it's parent class
    // method overriding 
    void pro() {

    }
}