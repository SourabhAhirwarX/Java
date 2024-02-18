class A {
    static int x = 4563;

    public static void main(String[] args) {
        A a = new A();

        a.pro();
        x = 18;
        a.pro();
    }

    void pro() {
        System.out.println(A.x);
    }
}