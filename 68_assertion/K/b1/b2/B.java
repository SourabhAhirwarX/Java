package b1.b2;

public class B {
    public void info() {
        int x = 4;

        // several line of code...

        assert(x > 10):"assert call in class B: info is running";

        // several line of code...

        System.out.println(x);
    }
}