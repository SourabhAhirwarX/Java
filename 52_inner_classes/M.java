class A {
    int n; 

    void info() {
        System.out.println("hello");
    }

    class B {
        void pro() {
            System.out.println(n);
            info();
        }
    }

    public static void main(String[] args) {        
        A z = new A();
        z.n = 34;
        B t = z.new B();

        t.pro();

        A y = new A();
        y.n = 89;
        B s = y.new B();

        s.pro();
    }
}