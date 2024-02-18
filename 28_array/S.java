class A {
    public static void main(String[] args) {
        // int[] x = {1, 2, 3, 4};
        // System.out.println(x instanceof int[]);
 
        int[][] x = {{1,2}, {3, 4, 5, 6}};
        // System.out.println(x instanceof int[][]);
        System.out.println(x instanceof int[]);         // error: incompatible types: int[][] cannot be converted to int[]
        // System.out.println(x[0] instanceof int[]);
        System.out.println(x[0][0] instanceof int);        // error: unexpected type
    }
}