// Access through instantiation

class A {
    public static void main(String[] args) {
        B x = new B();
        
        System.out.println(x.y);
        x.pro();
    }
}

class B {
    int y = 99;

    void pro() {
        System.out.println("Hello Ji");
    }
}