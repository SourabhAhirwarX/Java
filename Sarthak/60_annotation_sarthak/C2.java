class X {
    void process(int y) {
        System.out.println("Hello");
    }
}

class Y extends X {
    @Override
    void process(float y) {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        Y y = new Y();

        y.process();
    }
}

// error: method does not override or implement a method from a supertype