class H {
    //older method not in use
    @Deprecated
    void pro() {
        System.out.println("Hello");
    }

    //newer method 
    void pro(int y) {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        H h = new H();

        h.pro();
    }
}