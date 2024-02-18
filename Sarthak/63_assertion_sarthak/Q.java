public class Q {
    public static void main(String[] args) {
        int x = 7;

        try {
            assert(x>10):"Some thing went wrong...";
            // inappropriate way of using the assert keyword
        } catch(AssertionError e) {
            e.printStackTrace();
            System.out.println("Hello");
        }

        System.out.println("Hi");
    }
}