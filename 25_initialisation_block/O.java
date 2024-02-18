class A {
    static {
        System.out.println(x);  // error: illegal forward reference
    }
    
    static int x = 90;
}