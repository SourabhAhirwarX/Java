class A {
    public static void main(String[] args) {
        int[] x = new int[2];
        
        System.out.println(x[-1]);         // Exception: ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2
    }
}