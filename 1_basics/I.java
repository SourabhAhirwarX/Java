class X {
    // variable declaration is an allowed statement inside a class
    int e;
    int f = 9;
    int r;

    // variable type declaration cum initialization is a valid statement
    int s = 45;

    // apart from variable creation statements, method definition and constructor definition statements, 
    // all other statements must go inside a code block(method or a constructor)
    // r = e + f;                    Error!
    // r = 90;                       Error!
    // System.out.println("hello");  Error!

    int add(int a, int b) {
        // variable declaration, instantiation, intialization is an allowed statement inside a method & constructor
        int sum = 0;
        sum = a + b;
        
        System.out.println(sum);
        return sum;
    }
}