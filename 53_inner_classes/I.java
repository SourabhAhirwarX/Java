class A {
    void pro() {
        // Method Local Inner Class
        class B {
            int n = 90;

            void info() {
                System.out.println("hiii...");
            }
        }

        B y = new B();
        System.out.println(y.n);
        y.info();
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}