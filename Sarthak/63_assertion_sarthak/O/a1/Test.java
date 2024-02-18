package a1;

import a1.a2.A;

class Test {
    public static void main(String[] args) {
        Object x = new A();

        // assert(x instanceof A):"Wrong instance...";
        
        A y = (A)x; 
        y.pro();
    }
}