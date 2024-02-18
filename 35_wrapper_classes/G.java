class A {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf("golu");        // Exception in thread "main" java.lang.NumberFormatException: For input string: "golu"
        // Byte x = Byte.valueOf("12");
        Byte x = Byte.valueOf("128");          // Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10

        System.out.println(x);
    }
}