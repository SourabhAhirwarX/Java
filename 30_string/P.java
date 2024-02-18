class A {
    public static void main(String[] args) {
        boolean x = "987".matches("\\d\\d\\d");
        boolean y = "987".matches("\\d\\d");

        System.out.println(x);
        System.out.println(y);
    }
}