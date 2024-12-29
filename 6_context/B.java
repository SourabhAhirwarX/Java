class A {
    int a = 90;

    public static void main(String[] args) {
        // static method creates class context
        
        System.out.println(a);  // a is an instance level variable
        // at line 7 we are accessing the member variable
        // instance member is accessed directly
    }
}

// error: non-static variable a cannot be referenced from a static context