class A {
    {
        System.out.println(x);  // error: illegal forward reference
    }
    
    int x = 90;

    public static void main(String[] args) {
        new A();
    }
}