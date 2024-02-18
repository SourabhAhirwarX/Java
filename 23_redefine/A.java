class A {
    int x = 2;
}

class B extends A {
    int x = 5;
}

class X {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        
        A a1 = new A();
        System.out.println(a1.x);
    }
}