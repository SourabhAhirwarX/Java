class X {
    public static X x;

    private X() {

    }
}

class A {
    public static void main(String[] args) {
        System.out.println(X.x);
    }
}