class A {
    public static void main(String[] args) {
        int[] x = new int[5];
        x.length = 9;           // length is final field can't modify it
        // error: cannot assign a value to final variable length
    }
}