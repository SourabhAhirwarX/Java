class A {
    static float e = 2.3f;

    static void info() { 
        System.out.println("Golu");
    }
    
    static class B {
        void pro() {
            System.out.println(e);
            info();
        }
    }

    public static void main(String[] args) {
        B x = new B();
        x.pro();
    }
}