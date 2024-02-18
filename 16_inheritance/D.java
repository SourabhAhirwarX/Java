class X {
    void info() {
        System.out.println("Hello...");
    }
}

class A extends X {
    void pro() {
        System.out.println("Hi...");
    }
    
    public static void main(String[] args) {
        A x = new A();
        x.info();       // whose return type is void cannot be called in sop
        x.pro();

        // System.out.println(x.info());    // error: 'void' type not allowed here
        System.out.println(x.toString());
        System.out.println(x.hashCode());
    }
}