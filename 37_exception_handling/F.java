class A {
    static String x;
    public static void main(String[] args) {
        System.out.println("A");

        try {
            System.out.println("B");
            System.out.println(x.length());
            System.out.println("C");
        } catch(NullPointerException e) {
            System.out.println("D");
        }

        System.out.println("E");
    }
}