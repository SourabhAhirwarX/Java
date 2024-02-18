class A {
    final int x = 90;
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);

        // we cannot modify the variable value
        // error: cannot assign a value to final variable x
        a.x = 88;
    }
}