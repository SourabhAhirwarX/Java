class A {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf(2);     // error: no suitable method found for valueOf(int)
        Byte x = Byte.valueOf((byte)2);

        System.out.println(x);
    }
}