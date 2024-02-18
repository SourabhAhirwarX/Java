interface B {   }

class A implements B {    }

class X {
    public static void main(String[] args) {
        // Case 3:
        B x = new A();
        System.out.println(x);
        
        // Case 2;
        // new B();    // error: B is abstract; cannot be instantiated
        
        // Case 1:
        B y;
    }
}