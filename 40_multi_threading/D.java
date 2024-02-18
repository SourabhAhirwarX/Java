class A {
    public static void main(String[] args) {
        X.pro();
        System.out.println("A");
    }
}

class X {
    static void pro() {
        Y.info();
        System.out.println("B");
    }
}

class Y {
    static void info() {
        System.out.println("C");

        for(int i=1; i<=100; i++) {
            System.out.println(i);
        }

        System.out.println("D");
    }
}

// one function execute at a time 