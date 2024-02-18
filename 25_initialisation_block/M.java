class A {
    static int y = 45;

    static {
        System.out.println(y);
    }

    public static void main(String[] args) {
        new A();
    }
}