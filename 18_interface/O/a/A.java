package a;

import b.B;

// Case 3:
class A implements B {
    public void pro() {

    }
}


// Case 2:
/*
    class A implements B {
        void pro() {

        }
    }
*/
// attempting to assign weaker access privileges; was public


// Case 1:
/* 
    class A implements B {
        
    }
*/
// error: A is not abstract and does not override abstract method pro() in B