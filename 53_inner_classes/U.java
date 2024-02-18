class A {
    private static float e = 2.3f;

    private static void info() { 
        System.out.println("Golu");
    }

    static class B {
        static int y = 90;

        static private void pro() {
            System.out.println(e);
            info();
        }
    }

    public static void main(String[] args) {
        B.pro();
    }
}