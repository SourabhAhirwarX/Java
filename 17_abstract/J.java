abstract class X {
    // X() {    
            // cannot create the object or cannot call the constructor,
            // but, we use it and constructor also provide constructor 
    // }

    abstract void pro();
}

class A {
    public static void main(String[] args) {
        new X();    // error: X is abstract; cannot be instantiated
    }
}