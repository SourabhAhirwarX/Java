// B is now parent classs of class A
// A is now child class of class B

class A extends B {
    public static void main(String[] args) {
        // Access through instantiation
        A x = new A();

        System.out.println(x.e);
        x.pro();
    }
}

class B {
    int e = 2;

    void pro() {
        System.out.println("Hello Chacha");
    }
}