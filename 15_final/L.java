class X {
    final void pro() {
        System.out.println("Hello Hi...");
    }
}

class A extends X {
    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}