class A {
    static void pro(int... x) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        pro();
        pro(18);
        pro(18, 45);

        int[] x = {15, 18, 45, 99};
        pro(x);
    }
}