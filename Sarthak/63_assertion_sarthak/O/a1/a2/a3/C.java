package a1.a2.a3;

import a1.a2.A;

public class C {
    public void pqr() {
        Object e = new D();

        assert(e instanceof A):"assertion in class C";

        D d = (D)e;
        d.abc();
    }
}


// />java -ea:a1... -da:a1.a2.a3.C a1/Test
