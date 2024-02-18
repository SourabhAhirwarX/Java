// B is now parent class of class A
// A is now child class of parent class B

// Access through Inheritance
// in this type we have to create the object of child class and using this object we can access all the properties and behaviour of the parent class(internally super is called)

class A extends B {
    public static void main(String[] args) {
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