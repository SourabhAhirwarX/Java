package a1;

import a1.a2.A;

public class test {
    public static void main(String[] args) {
        A x = new A();

        assert(x instanceof A):"wrong instance...";

        x.pro();
    }
}