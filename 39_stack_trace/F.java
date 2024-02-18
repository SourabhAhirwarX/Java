class A {
    static {
        System.out.println(2);
    }

    static {
        System.out.println(3);
        int x = 34/0;
        System.out.println(4);
    }
    public static void main(String[] args) {
        System.out.println(1);
    }
}