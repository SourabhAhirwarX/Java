class A {
    class B {
        int y = 11;
        void info() {
            System.out.println("Hello Ji");
        }
    }

    void pro() {
        // error: cannot find symbol
        // info();  
        // System.out.println(y);
        
        B r = new B();
        System.out.println(r.y);
        r.info();
    }

    public static void main(String[] args) {
        A  x = new A();
        x.pro();
    }
}