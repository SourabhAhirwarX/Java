class A {
    {
        System.out.println("C");
    }

    static {
        System.out.println("K");
    }

    A() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        System.out.println("Z");

        A x = new A();
        
        System.out.println("Q");
    }
}