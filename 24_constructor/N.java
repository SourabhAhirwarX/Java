class A {
    static int i = 50;       // marked variable as static for counting purpose
    
    A() {
        i++;
    }

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.i);

        A a2 = new A();
        System.out.println(a2.i);

        A a3 = new A();
        System.out.println(a3.i);

        A a4 = new A();
        System.out.println(a4.i);
    }
}