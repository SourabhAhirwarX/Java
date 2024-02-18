class A {
    static String[] x;
    public static void main(String[] args) {
        System.out.println(x.length);       // Exception : NullPointerException

        // System.out.println(x[0]);
        
        System.out.println(x);
    }
}