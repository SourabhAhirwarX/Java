// X is a singleton class (Early Initialization)

//  Step-1: We have to mark all the constructors as private
//  step-2: create a public static reference variable of class X and assign an X object;

class X {
    private X() {

    }

    public static X obj = new X();
}

class A {
    public static void main(String[] args) {
        // X x1 = new X();    
        // X x1 = new X();    
        // X x1 = new X();    
        X x1 = X.obj;    
        X x2 = X.obj;    
        X x3 = X.obj; 
        
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}