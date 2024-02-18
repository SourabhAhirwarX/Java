class A {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 3;
        short s = 345;
        int i = 34567;
        float f = 3.4f;
        double d = 4.5;

        int[] x = {a, b, s, i, (int)f, (int)d};
        
        for(int w : x) {
            System.out.println(w);
        }
    }
}