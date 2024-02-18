class A {
    public static void main(String[] args) {
        int x = 90;
        pro();
    }

    static void pro() {
        System.out.println(x);     // error: cannot find symbol
    }
}