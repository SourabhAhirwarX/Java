class A {
    public static void main(String[] args) {
        B x = new B();
        System.out.println(B.y);    // error: non-static variable y cannot be referenced from a static context
        B.pro();                    // error: non-static method pro() cannot be referenced from a static context
    }
}

class B {
    int y = 99;

    void pro() {
        System.out.println("Hello Ji");
    }
}