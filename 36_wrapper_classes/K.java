class A {
    public static void main(String[] args) {
        Integer x = 12;
        Integer y = x;
        System.out.println(x);
        System.out.println(y);

        ++x;
        System.out.println(x);
        System.out.println(y);
    }
}