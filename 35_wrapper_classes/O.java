class A {
    public static void main(String[] args) {
        // Float x = Float.valueOf("3.45f");
        Float x = Float.valueOf("4.45");
        // Float x = Float.valueOf("4.45f");
        // Float x = Float.valueOf(2.3e3f);
        // Float x = Float.valueOf("2.3e3f");
        // Float x = Float.valueOf("2.3e3j");      // Exception in thread "main" java.lang.NumberFormatException: For input string: "2.3e3j"

        System.out.println(x);
    }
}