class A {
    static {
        System.out.println("E");
    }

    {
        System.out.println("C");
    }

    static {
        System.out.println("L");
    }

    A() {
        System.out.println("R");
    }
}

class X extends A {
    {
        System.out.println("I");
    }

    static {
        System.out.println("Y");
    }

    {
        System.out.println("W");
    }

    X() {
        System.out.println("O");
    }

    public static void main(String[] args) {
        {
            System.out.println("G");
        }

        X a = new X();
        
        System.out.println("U");
    }
}