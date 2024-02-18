// short - 2 byte - 16 bits 
// (signed)  
// -32768 ---- 32767

class A {
    public static void main(String[] args) {
        // short x = -32768;
        // short x = -32769;  // error: incompatible types: possible lossy conversion from int to short
        
        short x = 32767;        
        // short x = 32768; // error: incompatible types: possible lossy conversion from int to short        

        System.out.println(x);
    }
}