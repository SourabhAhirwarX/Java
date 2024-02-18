abstract class A {
    static int a = 20;
    final int b = 30;
}

class B extends A {
    public static void main(String[] args) {
        System.out.println(A.a);
        B x = new B();
        System.out.println(x.b);
    }
}