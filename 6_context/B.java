class A {
    int a = 90; // instance level variable member

    public static void main(String[] args) {
        // static method creates class context
        
        System.out.println(a);  // a is an instance level variable
        // at line 7 we are accessing the instance level member variable
        // instance member is not accessible directly
    }
}

// error: non-static variable a cannot be referenced from a static context