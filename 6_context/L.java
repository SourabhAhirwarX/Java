class A {
    int x = 4517;

    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }

    void pro() {
        System.out.println(A.x);        // error: non-static variable x cannot be referenced from a static context
    }
}