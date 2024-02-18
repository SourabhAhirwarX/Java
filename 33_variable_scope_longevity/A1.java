class A {
    void pro() {
        System.out.println("Hello");
        System.out.println(x);    // error: cannot find symbol
        int x = 9;
    }

    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}