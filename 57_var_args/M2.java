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
        int i = 989246;
        long l = 34635456347L;

        pro(c, b, i, s, (int)l);
    }
}