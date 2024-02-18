class A {
    public static void main(String[] args) {
        byte a = 2;

        // short b = a;
        // Short b = a;       // error: incompatible types: byte cannot be converted to Short
        Short b = (short)a;

        // int c = a;
        // Integer c = a;    // error: incompatible types: byte cannot be converted to Integer
        Integer c = (int)a;

        // long d = a;
        // Long d = a;       // error: incompatible types: byte cannot be converted to Long
        Long d = (long)a;

        // float e = a;
        // Float e = a;      // error: incompatible types: byte cannot be converted to Float
        Float e = (float)a;

        // double f = a;
        // Double f = a;     // error: incompatible types: byte cannot be converted to Double
        Double f = (double)a;
    }
}