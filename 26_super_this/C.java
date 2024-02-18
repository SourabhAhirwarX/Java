class x {
    X(A a) {
        
    }
}

class A extends X {
    static {
        System.out.println(this);
    }
    
    static void pro() {
        System.out.println(this);
    }

    A() {
        super(this);
        System.out.println(this);
    }
}