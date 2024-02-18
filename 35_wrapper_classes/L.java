class A {
    public static void main(String[] args) {
        // Short x = Short.valueOf("111");
        Short x = Short.valueOf("111", 2);

        System.out.println(x);
    }
}