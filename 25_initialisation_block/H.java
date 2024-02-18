class A {
    {
        System.out.println("H");
    }

    {
        System.out.println("Y");
    }

    {
        System.out.println("W");
    }

    A() {
        System.out.println("J");
    }

    public static void main(String[] args) {
        System.out.println("T");

        A x = new A();
        
        System.out.println("Q");
    }
}