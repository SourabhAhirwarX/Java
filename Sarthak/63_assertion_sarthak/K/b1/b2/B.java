package b1.b2;

public class B {
    public void info() {
        int x = 5;

        // lots of code...
        
        assert(x > 10):"assert call in class B:info is running";
        
        // lots of code...

        System.out.println(x);
    }
}
