class A {
    public static void main(String[] args) {
        int[][] x = new int[2][];

        System.out.println(x[0]);

        x[0] = new int[3];
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);

        System.out.println(x[1]);
        
        x[1]= new int[5];
        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println(x[1][2]);
        System.out.println(x[1][3]);
        System.out.println(x[1][4]);
        // System.out.println(x[1][5]);
    }
}