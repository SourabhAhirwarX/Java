// byte - 1 byte - 8 bits 
// by default they are signed
// (signed)
// -128, - - , 0 , - - , 127

class A {
    public static void main(String[] args) {
        // byte x = -128;
        // byte x = -129;      // error: incompatible types: possible lossy conversion from int to byte
        byte x = 127;
        // byte x = 128;       // error: incompatible types: possible lossy conversion from int to byte

        System.out.println(x);
    }
}