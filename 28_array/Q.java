class A {
    public static void main(String[] args) {
        // Case: 1
        // int[][] x = {{1}, {2}, {3}};
        int[][] x = {1, 2, 3};         // error: incompatible types: int cannot be converted to int[]
        int[] y = {{1,2}, {3,4,5,6}};  // error: illegal initializer for int

        // Case: 2
        // Object x = {1, 2, 3, 4};       // error: illegal initializer for Object
        // Object y = new int[]{12, 13, 14};

        // Case: 3
        // int[][] x = new int[];         // error: array dimension missing
        // int[] x = new int[][];         // error: array dimension missing
    }
}