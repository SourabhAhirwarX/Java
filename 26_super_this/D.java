class X {
    int t = 999;
}

class A extends X {
    void pro() {
        System.out.println(t);
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}