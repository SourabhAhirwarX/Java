class A {
    public static void main(String[] args) {
        int[] x = new int[];             // error: array dimension missing

        // int[2] x = new int[];         // error: not a statement

        // we can also instantiate array as this
        int arr[] = new int[3];
    }
}