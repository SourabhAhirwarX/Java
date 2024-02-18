final class X {
    void pro() {
        System.out.println("Hello Duniya....");
    }
}

class A /*extends X*/ {
    public static void main(String[] args) {
        X a = new X();
        a.pro();
    }
}