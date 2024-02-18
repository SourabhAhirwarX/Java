class A {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 2;
        short c = 234;
        int d = 5000;
        
        int[] x = {a, b, c, d};

        for(int w : x) {
            System.out.println(w);
        }
    }
}