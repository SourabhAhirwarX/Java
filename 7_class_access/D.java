class A {
    public static void main(String[] args) {
        B x = new B();
        System.out.println(y);      // error: cannot find symbol
        pro();                      // error: cannot find symbol
    }
}

class B {
    int y = 99;

    void pro() {
        System.out.println("Hello Ji");
    }
}