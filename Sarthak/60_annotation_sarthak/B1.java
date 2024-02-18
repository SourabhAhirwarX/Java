class X {
    void process() {
        System.out.println("Hello");
    }
}

class Y extends X {
    void proces() {     // check spelling error, so it might be possible that some problems may occur during overriding
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        Y y = new Y();

        y.process();
    }
}