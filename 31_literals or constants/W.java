// long - 8 bytes - 64 bits 
// (signed)  
// -9223372036854775808 --------- 9223372036854775807 

class A {
    public static void main(String[] args) {
        // long x = -9223372036854775808;  // error: integer number too large
        long x = -9223372036854775808L;
        // long x = -9223372036854775809L;  //error: integer number too large

        System.out.println(x);
    }
}