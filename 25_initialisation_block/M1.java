class A {
    static {
        System.out.println(y);    // error: illegal forward reference
    }

    static int y = 80;

    public static void main(String[] args) {
        
    }
}