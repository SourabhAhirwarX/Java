package a1.a2;

public class A {
    public void pro() {
        Object y = new B();

        assert(y instanceof A):"assertion in class A";

        B b = (B)y;
        b.info();
    }
}
