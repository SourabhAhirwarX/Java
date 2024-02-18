class B1 {
    B1() {
        System.out.println("Constructor B");
    }
}

class A extends B1 {
    A() {
        System.out.println("Constructor A");
    }
    //pro();
    //sout(x);
    //new A(); //compiler provided default constructor
}

class X {
    public static void main(String[] args) {
        new A(); //compiler provided default constructor
    }
}