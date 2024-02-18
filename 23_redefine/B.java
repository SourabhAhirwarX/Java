class A {
    static int x = 20;
}

class B extends A {
    static int x = 50;
}

class X {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        
        A a1 = new A();
        System.out.println(a1.x);
    }
}