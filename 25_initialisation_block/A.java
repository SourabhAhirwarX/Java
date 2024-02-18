// instance initialisation block
class A {
    {
        System.out.println("Hello");
    }

    A() {
        // from the first line of the constructor call the instance initialization blocks are called
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("A");

        A x = new A();

        System.out.println("B");
    }
}

// static initialisation block
/*
    class A {
        static {
            System.out.println("Hello");
        }

        A() {
            System.out.println("Hi");
        }

        public static void main(String[] args) {
            System.out.println(1);

            A x = new A();

            System.out.println(2);
        }
    }
*/