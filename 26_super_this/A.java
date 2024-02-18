class A {
    // instance initialization block
    {
        System.out.println(this + " a");
    }

    A() {
        System.out.println(this + " b");
    }

    void pro() {
        System.out.println(this + " c");
    }

    public static void main(String[] args) {
        A x = new A();

        System.out.println(x);
        
        x.pro();
    }
}