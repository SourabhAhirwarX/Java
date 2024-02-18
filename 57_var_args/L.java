class A {
    static void pro(int... x) {
        for(int t : x) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        char c = 'A';
        byte b = 23;
        short s = 345;
        int i = 987987;

        pro(c, b, i, s);
    }
}