class X {
    X(int y) {
        System.out.println(y);
    }
}

class A extends X {
    int x = 80;
    
    A() {
        super(x);       // error: cannot reference x before supertype constructor has been called
    }
    
    public static void main(String[] args) {
        A a = new A();
    }
}