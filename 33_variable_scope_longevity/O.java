class A {
    static int e = 9;
    int f = 4;

    void pro() {
        int w = 1;

        {
            int r = 3;
        }
    }

    public static void main(String[] args) {
        A a = new A();

        a.pro();

        a = null;
    }
}