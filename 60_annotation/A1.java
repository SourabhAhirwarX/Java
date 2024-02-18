class X {
    void process() {
        System.out.println("Hello");
    }
}

class Y extends X {
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