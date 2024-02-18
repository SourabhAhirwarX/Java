class A {
    int y = 8;

    class B {
        int y = 80;

        void info() {
            int y = 800;
            System.out.println(y);
            System.out.println(this.y);
            // System.out.println(new B().y);
            // Q. how to use it with super???
        }
    }

    public static void main(String[] args) {
        new A().new B().info();
    }
}