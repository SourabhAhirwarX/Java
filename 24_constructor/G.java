class A {
    private A() {

    }
}

class B extends A {         // error: A() has private access in A
    public static void main(String[] args) {
        
    }
}