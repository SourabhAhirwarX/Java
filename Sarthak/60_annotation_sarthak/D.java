class X {
    
}

class Y extends X {
    @Override
    void process(int y) {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        Y y = new Y();

        y.process(45);
    }
}

// error: method does not override or implement a method from a supertype
