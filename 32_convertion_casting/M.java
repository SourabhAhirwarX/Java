//short -> -32768 to 32767
//char -> 0 to 65535
class A {
    public static void main(String[] args) {
        //Case 2:
        char t = 2;
        short a = t;

        //Case 1:
        short b = 2;
        char n = b;
    }
}

// error: incompatible types: possible lossy conversion from short to char
// error: incompatible types: possible lossy conversion from short to char