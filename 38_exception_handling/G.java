class X {
    X() {
        Class.forName("Golu");     //error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
        System.out.println("A");
    }
}

class A extends X {
    // internal working
    // A() {
    //     super();
    // }
    public static void main(String[] args) {
        System.out.println("B");
        A a = new A();  // access through inheritance
        System.out.println("C");
    }
}