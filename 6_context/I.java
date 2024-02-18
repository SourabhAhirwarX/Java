class A {
    int x = 90;

    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }

    void pro() {
        System.out.println(x);      // instance level variable are directly accessible in the instance context 
    }
}