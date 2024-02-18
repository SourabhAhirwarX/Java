class A {
    int y = 8;

    class B extends Z {
        // int y = 80;

        void info() {
            // int y = 800;
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        new A().new B().info();
    }
}

class Z extends T {
    // int y = 45;
}

class T {
    int y = 120;
}