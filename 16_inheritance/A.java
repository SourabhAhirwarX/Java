class A {

    // in this case, if we don't have pro method in the same class
    // void pro() {
    //     System.out.println("Hello...");
    // }

    public static void main(String[] args) {
        A x = new A();

        x.pro();          // error: cannot find symbol
    }
}