//byte -> -128 to 127
//char -> 0 to 65535


class A {
    public static void main(String[] args) {
        byte a = 2;
        // byte a = -20;
        
        // char x = a;
        char x = (char)a;
        System.out.println((int)x);

    }
}

// error: incompatible types: possible lossy conversion from byte to char