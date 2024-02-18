//byte -> -128 to 127
//char -> 0 to 65535

class A {
    public static void main(String[] args) {
        char x = 2;
        byte a = x;
    }
}

//error: incompatible types: possible lossy conversion from char to byte