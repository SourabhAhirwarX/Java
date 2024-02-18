class X {
    void process(int y) {
        System.out.println("Hello");
    }
}

class Y extends X {
    void process(float y) {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        Y y = new Y();

        y.process(12);
        y.process(12.2f);
    }
}