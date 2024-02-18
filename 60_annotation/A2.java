class X {
    void process() {
        System.out.println("Hello");
    }
}

class Y extends X {
    @Override
    void pross() {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        X x = new Y();

        x.process();
    }
}

// error: method does not override or implement a method from a supertype