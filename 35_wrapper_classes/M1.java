class A {
    public static void main(String[] args) {
        byte a = 23;
        short b = 234;
        char c = 'a';

        Integer x = Integer.valueOf(a);
        Integer y = Integer.valueOf(b);
        Integer z = Integer.valueOf(c);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}