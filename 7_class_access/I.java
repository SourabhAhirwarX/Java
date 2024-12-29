// B is now parent classs of class A
// A is now child class of class B

// we are creating constructor of class A...

class A {
    public static void main(String[] args) {
        A x = new A();

        System.out.println(x.e);    // error: cannot find symbol
        x.pro();                    // error: cannot find symbol
    }
}

class B {
    int e = 2;

    void pro() {
        System.out.println("Hello Chacha");
    }
}