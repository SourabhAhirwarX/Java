class X {
    {
        System.out.println("T");
    }

    X() {
        System.out.println("D");
    }
}

class A extends X {
    {
        System.out.println("K");
    }

    A() {
        System.out.println("M");
    }

    public static void main(String[] args) {
        System.out.println("Z");

        A x = new A();

        System.out.println("Q");
    }
}

/*
    Z
    T
    D
    K
    M
    Q
*/