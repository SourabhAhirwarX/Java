class A {
    int a = 1;
    private int b = 2;
    static int c = 3;
    static private int d = 4;

    void pro() {
        // Method Local Inner Class
        class B {
            void info() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }
        }       

        B t = new B();
        t.info();
    }

    public static void main(String[] args) {
        A x = new A();
        
        x.pro();
    }
}