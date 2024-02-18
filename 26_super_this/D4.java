class A {
    int t = 999;

    A() {
        System.out.println(t);
    }
}

class B extends A {
    int t = 222;

    void pro() {
        int t = 746;
        System.out.println(t);
        System.out.println(this.t);
        System.out.println(super.t);
    }

    B() {
        super();
        System.out.println(t);
    }

    public static void main(String[] args) {
        B x = new B();
        
        x.pro();
    }
}