package b1.b2;

// import is not compulsory because, both are in same package
import a1.a2.a3.A;

class D extends A {
    public static void main(String[] args) {
        // Access through instantiation
        // A x = new A();           // correct directly creating Object of parent class
        // System.out.println(x.t); // wrong! but calling its protected member gives error
        
        D x = new D();              // it will compiled successfully! because,
        System.out.println(x.t);    // we can call protected member of parent class by creating object of child class and access that member
    }
}