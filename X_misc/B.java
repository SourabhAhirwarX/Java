class A {
    static int[] x;
    public static void main(String[] args) {
        System.out.println(x[0]);               // Exception: NullPointerException
    }   
}