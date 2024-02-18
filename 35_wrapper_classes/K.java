class A {
    public static void main(String[] args) {
        // Short x = Short.valueOf("7936");
        Short x = Short.valueOf("32768");    // Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"32768" Radix:10

        System.out.println(x);
    }
}