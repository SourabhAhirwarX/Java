public class H {
    public static void main(String[] args) {
        int a = 2;

        //--- several lines of code...
        
        //augmented assertion
        assert(a > 10):abc();
        
        //--- several lines of code...

        System.out.println(a);
    }

    static int abc() {
        return 22;
    }
}
