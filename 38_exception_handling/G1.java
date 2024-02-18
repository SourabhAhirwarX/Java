class X {
    X() throws ClassNotFoundException {
        Class.forName("Golu");
        System.out.println("A");
    }
}

class A extends X {         // error: unreported exception ClassNotFoundException in default constructor
    public static void main(String[] args) {
        System.out.println("B");
        A a = new A();
        System.out.println("C");
    }
}