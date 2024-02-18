public class G {
    public static void main(String[] args) {
        int a = 2;

        //--- several lines of code...
        
        //augmented assertion
        assert(a > 10):++a;
        
        //--- several lines of code...

        System.out.println(a);
    }
}