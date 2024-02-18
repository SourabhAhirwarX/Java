class A {
    public static void main(String[] args) {
        int[][] x = new int[2][];

        // x[0] = {1, 2, 3, 4, 5, 6, 7};   // error: illegal start of expression
        x[0] = new int[]{1, 2, 3, 4, 5, 6, 7};
        x[1] = new int[4];

        System.out.println(x[0].length);
        System.out.println(x[1].length);
    }
}