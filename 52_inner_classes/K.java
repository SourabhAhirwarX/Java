class A {
    class B {
        
    }

    public static void main(String[] args) {
        A x = new A();
        System.out.println(x);

        B y1 = x.new B();
        System.out.println(y1);
        B y2 = x.new B();
        System.out.println(y2);

        A z = new A();
        System.out.println(z);
        B t = z.new B();
        System.out.println(t);
    }
}