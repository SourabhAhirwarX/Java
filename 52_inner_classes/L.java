class A {
    int n;      // instance level member variable

    class B {
        void pro() {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {        
        A z = new A();
        z.n = 34;

        B t = z.new B();
        t.pro();
    }
}