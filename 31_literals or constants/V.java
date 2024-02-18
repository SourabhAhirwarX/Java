// int - 4 bytes - 32 bits 
// (signed)  
// -2147483648 ------ 2147483647 

class A {
    public static void main(String[] args) {
        // int x = -2147483648;
        // int x = -2147483649;  // error: integer number too large

        int x = 2147483647;
        // int x = 2147483648;  // error: integer number too large
        
        System.out.println(x);
    }
}