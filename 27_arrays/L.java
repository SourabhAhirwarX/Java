class A {
    public static void main(String[] args) {
        boolean[] x = new boolean[2];

        System.out.println(x[0]);
        System.out.println(x[1]);

        x[0] = true;
        x[1] = false;

        System.out.println(x[0]);
        System.out.println(x[1]);
    }
}