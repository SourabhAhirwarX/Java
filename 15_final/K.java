class X {
    final void pro() {
        System.out.println("Hello Ji...");
    }
}

class A {
    public static void main(String[] args) {
        X a = new X();
        a.pro();    // we can still access the final method
    }
}