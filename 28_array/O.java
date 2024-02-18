class A {
    public static void main(String[] args) {
        // int[] y = new int[]{1, 2, 3};        // declaration, instantiation cum initialization
        int[][] x = new int[][]{{1,2}, {3,4,5,6}, {7,8,9}};
        // int[][] x = {{1,2}, {3,4,5,6}, {7,8,9}}; // short-cut technique

        for(int i=0; i<x.length; i++) {
            for(int j=0; j<x[i].length; j++) {
                // System.out.print("("+i+","+j+")  ");
                System.out.print(x[i][j]+"  ");
            }
            System.out.println();
        }

        // for(int i=0; i < x.length; i++) {
        //     System.out.println(x[i]);
        // }
    }
}