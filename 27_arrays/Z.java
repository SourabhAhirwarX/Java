class A {
    public static void main(String[] args) {
        byte b = 2;
        int i = b;
        System.out.println(i);

        int[] y = new byte[2];      // error: incompatible types: byte[] cannot be converted to int[]
    }
}