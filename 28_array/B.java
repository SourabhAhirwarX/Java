class A {
    public static void main(String[] args) {
        int[] x = new int[0];
        
        System.out.println(x[0]);    // Exception : ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }
}