class A {
    static void pro(float... w, int... r) {

    }

    public static void main(String[] args) {
        // pro(12.3f, 5.6f, 77.4f, 12, 45, 99);                     // error: varargs parameter must be the last parameter
        
        pro(new float[]{12.3f, 5.6f, 77.4f}, new int[]{12, 15, 45, 99}); //  error: varargs parameter must be the last parameter
    }
}