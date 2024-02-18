class X {
    void pro() {
        System.out.println("XYZ");
    }
}

class A extends X {
    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}