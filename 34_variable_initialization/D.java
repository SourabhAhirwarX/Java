class A {
    static int[] a = new int[2];
    int[] b = new int[2];

    public static void main(String[] args) {
        A x = new A();
        int[] c = new int[2];

        System.out.println(a[0]);
        System.out.println(x.b[0]);
        System.out.println(c[0]);
    }
}