class A {
    static void pro(int... x) {
        System.out.println(x.length);
    }

    public static void main(String[] args) {
        pro();
        pro(12);
        pro(12, 14, 15, 18);

        int[] x = {12, 15, 18, 45, 99};
        pro(x);
    }
}