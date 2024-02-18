class A {
    void pro() {
        // Method Local Inner Class
        class B {

        }
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}