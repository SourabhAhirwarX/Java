class A {
    public static void main(String[] args) {
        char x = '#';
        char x1 = '&';
        char x2 = '@';
        char x3 = '~';
        //char x4 = '';       // error: empty character literal
        //char x5 = ''';      // error: empty character literal
        char x6 = '\\';     // error: unclosed character literal
        char x7 = '\'';       
        // char x8 = '\\'';   // error: unclosed character literal

        System.out.println(">" + x + "<");
        System.out.println(">" + x1 + "<");
        System.out.println(">" + x2 + "<");
        System.out.println(">" + x3 + "<");
        // System.out.println(">" + x4 + "<");
        // System.out.println(">" + x5 + "<");
        System.out.println(">" + x6 + "<");
        System.out.println(">" + x7 + "<");
        // System.out.println(">" + x8 + "<");
    }
}