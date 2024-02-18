class A {
    public static void main(String[] args) {
        int[][] x = new int[3][];

        // System.out.println(x[0].length);     // Exception in thread "main" java.lang.NullPointerException
        System.out.println(x[0]);
        System.out.println(x[1]);
    }
}