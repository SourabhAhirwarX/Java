/* 
    by default the assertion is disabled,
    we have to enable it at the run time

    java -ea A
    java -enableassertions A
*/

class A {
    public static void main(String[] args) {
        int a = 2;

        // ---- several line of code....

        assert(a > 10);     // simple assertion

        // ---- several line of code....

        System.out.println(a);
    }
}