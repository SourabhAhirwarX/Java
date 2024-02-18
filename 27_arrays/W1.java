class A {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 2;
        short c = 234;
        int i = 2345;
        float f = 3.14f;
        double d = 3.2;

        int[] x = {a, b, c, i, f, d};
        // error: incompatible types: possible lossy conversion from float to int
        // error: incompatible types: possible lossy conversion from double to int

        for(int w : x) {
            System.out.println(w);
        }
    }
}