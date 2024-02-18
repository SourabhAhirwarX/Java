class X {
    void process() {
        System.out.println("Hello");
    }
}

class Y extends X {
    void process() {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        Y y = new Y();

        y.process();
    }
}