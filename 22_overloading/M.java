// Constructor overloading

class A {
    A() {
        System.out.println("CEO");
    }

    A(int y) {
        System.out.println("Hello");
    }

    A(String y) {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        A x1 = new A();
        A x2 = new A(12);
        A x3 = new A("golu");
    }
}