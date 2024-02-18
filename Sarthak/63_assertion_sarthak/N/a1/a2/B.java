package a1.a2;

import a1.a2.a3.C;

public class B {
    public void info() {
        Object x = new C();

        // assert(x instanceof A):"assertion in class B";
        //or
        //assert(x instanceof C):"assertion in class B";

        C c = (C)x;
        c.pqr();
    }
}


// />java -ea:a1... a1/Test
// or
// />java -ea:a1... -da:a1.a2.a3... a1/Test
