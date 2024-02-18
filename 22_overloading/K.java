class X {
    void pro(String y) {
        System.out.println("pro float param "+ y);
    }

    void pro(X y) {
        System.out.println("pro int param " + y);
    }
}

class A {
    public static void main(String[] args) {
        X a = new X();
        a.pro("mohan");

        a.pro(a);
        // a.pro(12);      // error: no suitable method found for pro(int)
    }
}