class A {
    public static void main(String[] args) {
        int x = 034;       // Octal integer constant  8*3+1*4=28
        // int x = 052;    // Octal integer constant  8*5+1*2=42
        // int x = 019;    // error: integer number too large

        // int x = 0x23;   // hexadecimal integer constant 16*2+1*3=35
        // int x = 0xa2;   // hexadecimal integer constant 16*10+1*2=162
        // int x = 0xag;   // error: ';' expected

        // long x = 045L;     // 37 => 8*4+1*5

        System.out.println(x);
    }
}