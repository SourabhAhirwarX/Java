class A {
    // method not the constructor don't get confused
    void A(int e) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A x = new A();
        x.A(2);     // remeber this is not the construtor call this is just a method same named as class name
    }
}