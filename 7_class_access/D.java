// Access through instantiation
// but we can't access it members and methods directly in another class

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