class A {
    public static void main(String[] args) {
        int[][] x = new int[2][3];

        // implicitly initialized by default value 0
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);

        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println(x[1][2]);
    }
}