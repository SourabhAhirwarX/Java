interface B {   }

class A implements B {    }

class X {
    public static void main(String[] args) {
        // Case 3:
        B x = new A();
        
        // Case 2;
        // new B();    // error: B is abstract; cannot be instantiated
        
        // Case 1:
        // B x;
    }
}