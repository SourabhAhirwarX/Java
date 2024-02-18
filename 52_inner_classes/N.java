class A {
    private int n; 

    private void info() {
        System.out.println("hi");
    }

    class B {
        void pro() {
            System.out.println(n);
            info();
        }
    }

    public static void main(String[] args) {        
        A z = new A();
        z.n = 99;
        B t = z.new B();

        t.pro();
    }
}