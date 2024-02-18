// Multi-dimentional array

class A {
    public static void main(String[] args) {
        int[][] x = new int[][]{{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};

        for(int i=0; i<x.length; i++) {
            for(int j=x[i].length-1; j>=0; j--) {
                    System.out.print(x[i][j]+"  ");
            }
            System.out.println();
        }
    }
}