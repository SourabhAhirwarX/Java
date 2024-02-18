// multi-dimentional array

class A {
    public static void main(String[] args) {
        int[][] x = new int[][]{{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};

        for(int i=x.length-1; i>=0; i--) {
            for(int j=0; j<x[i].length; j++) {
                    System.out.print(x[i][j]+"  ");
            }
            System.out.println();
        }
    }
}