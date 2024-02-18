class A {
    static void pro(int... x) {
        for(int t : x) {
            System.out.println(t);
        }

        System.out.println("--------------");
    }

    public static void main(String... args) {
        pro();
        pro(12);
        pro(12, 13, 14, 15, 18);

        int[] x = {12, 14, 16, 17};
        pro(x);
    }
}