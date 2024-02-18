/* 
    this is not a proper/good way of debugging your code, by writing printing statements to check whether the code is running at particular position or not.

    so for debugging the concept of assertion came into existence
    here,
        assert -> keyword
        assert(<test-expression>) => generates a boolean value
        asserting that the some thing is true...

    generates AssertionException in case of false.
*/

class A {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(2);

            int[] arr = {4, 0, 2};
            System.out.println(arr[x]);
            
            System.out.println(3);
            
            int a = 12/arr[x];

            System.out.println(4);
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println(5);
    }
}