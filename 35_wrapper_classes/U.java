class A {
    public static void main(String[] args) {
        int x = 23;

        // Long y = x;     // error: incompatible types: int cannot be converted to Long
        Long y = (long)x;

        float z = 6.7f;
        // Double w = z;
        Double w = (double)z;
    }
}

// Java does not support conversion then boxing...