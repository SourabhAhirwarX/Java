// allowded statements, inside a class...

class X {
    // variable declaration is an allowed statement inside a class
    String e;
    int f = 9;
    float r;

    // variables type declaration cum initialization is a valid statement
    int s = 45;

    // apart from variable creation statements, method definition and constructor definition statements, 
    // all other statements must go inside a code block(method or a constructor)
    // r = e + f;                    Error!
    // r = 90;                       Error!
    // System.out.println("hello");  Error!


    int add(int a, int b) {
        // variable declaration is an allowed statement inside a method
        int sum = 0;

        sum = a + b;
        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        
    }
}