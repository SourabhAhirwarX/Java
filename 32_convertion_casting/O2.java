class A {
    public static void main(String[] args) {
        char a = 3;
        byte b = 3;

        short x = a + b;
        // short x = (short) (a + b);
        
        // System.out.println(x);
    }
}

// error: incompatible types: possible lossy conversion from int to short