class X {
    final void pro() {
        System.out.println("Hello Byden...");
    }
}

class A {
    // just a coincidence of same names method, 
    // there is no role of class X method
    // we are not modifying the methods we just creates another(same name) method
    void pro() {
        System.out.println("Hello Modi...");
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
        X a = new X();
        a.pro();
    }
}