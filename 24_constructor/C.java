class A {
    A(int x) {    // error: <identifier> expected
        System.out.println("hello");
    }
}

class X {
    public static void main(String[] args) {
        new A();
    }
}

/*
    C.java:9: error: constructor A in class A cannot be applied to given types;
            new A();
            ^
    required: int
    found: no arguments
    reason: actual and formal argument lists differ in length
*/