class A {
    public static void main(String[] args) {
        float[] x = new float[2];

        System.out.println(x[0]);
        System.out.println(x[1]);

        x[0] = 2.15f;
        x[1] = 3.44F;

        System.out.println(x[0]);
        System.out.println(x[1]);
    }
}