class A {
    void pro() {
        System.out.println(x);  // error: cannot find symbol
        int x = 90;
    }

    public static void main(String[] args) {
        new A();
    }
}