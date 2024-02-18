public class C {
    public static void main(String[] args) {
        int a = 2;

        //--- several lines of code...
        
        //simple assertion
        assert(a > 10);
        
        //--- several lines of code...

        System.out.println(a);
    }
}


// />java -ea C <press-enter>
// />java -enableassertions C <press-enter>