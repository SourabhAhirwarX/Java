/* 
    
*/

class A {
    public static void main(String[] args) {
        int a = 2;

        // ---- several line of code....

        assert(a > 10):"Unexpected Value";     // augmented assertion
        // we can write any type of value after colon

        // ---- several line of code....

        System.out.println(a);
    }
}