class A {
    public static void main(String[] args) {
        String x = "mohan";
        String y = x;

        System.out.println(x);
        x = "om";
        String z = "mohan";

        System.out.println(y == z);
    }
}