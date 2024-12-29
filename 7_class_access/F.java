class A {
    public static void main(String[] args) {
        B x = new B();  
        System.out.println(B.y);
        B.pro();
    }
}

class B {
    static int y = 99;

    static void pro() {
        System.out.println("Hello Ji");
    }
}