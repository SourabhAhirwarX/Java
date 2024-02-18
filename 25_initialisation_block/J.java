class A {
    public static void main(String[] args) {
        System.out.println("S");
        A x = new A();
        System.out.println("K");
    }

    A() {
        System.out.println("Q");
    }

    int x;

    void pro() {
        System.out.println("W");
    }
    
    {
        System.out.println("A");
    }
}