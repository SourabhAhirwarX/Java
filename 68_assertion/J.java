/* 
    
*/

class A {
    public static void main(String[] args) {
        int a = 2;

        // ---- several line of code....

        assert(a > 10):abc();     // augmented assertion
        // error: 'void' type not allowed here
        // we can write any type of value after colon
 
        // ---- several line of code....

        System.out.println(a);
    }
 
    static void abc() {
        
    }
}