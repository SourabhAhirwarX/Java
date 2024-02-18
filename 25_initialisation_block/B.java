class A {
    static {
        System.out.println("Hi");
    }

    A() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        System.out.println("B");

        A a = new A();
        
        System.out.println("A");
    }
}