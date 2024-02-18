class A {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf("111");
        // Byte x = Byte.valueOf("111", 2);
        // Byte x = Byte.valueOf("58", 8);     // Exception in thread "main" java.lang.NumberFormatException: For input string: "58"
        Byte x = Byte.valueOf("57", 8);

        System.out.println(x);
    }
}