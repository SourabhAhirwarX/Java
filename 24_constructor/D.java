class A {
    void A(int t) {
        System.out.println("Hello");
    }
}

class X {
    public static void main(String[] args) {
        new A(2);   // error: constructor A in class A cannot be applied to given types
    }
}

// constructor can't return any thing
// a tricky just check we didn't created the constructor its simply a method as constructor can't return any thing even void is not allowded