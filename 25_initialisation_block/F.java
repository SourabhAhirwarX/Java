class X {
    {
        System.out.println("T");
    }

    static {
        System.out.println("F");
    }

    X() {
        System.out.println("D");
    }
}

class A extends X {
    {
        System.out.println("K");
    }

    static {
        System.out.println("R");
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