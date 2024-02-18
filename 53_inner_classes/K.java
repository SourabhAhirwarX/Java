class A {
    void pro() {
        // Method Local Inner Class
        class B {
            int n = 90;

            void info() {
                System.out.println("hiii...");
            }
        }       
    }

    public static void main(String[] args) {
        A x = new A();
        
        x.pro();
        // B z = new B();
        // B z = x.new B();
    }
}