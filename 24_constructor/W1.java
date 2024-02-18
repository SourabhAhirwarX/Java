class X {
    X(int y) {
        System.out.println(y);
    }
}

class A extends X {
    static int x = 80;
    A() {
        // super();       // error: cannot reference x before supertype constructor has been called
        super(x);
    }
    
    public static void main(String[] args) {
        A a = new A();
    }
}