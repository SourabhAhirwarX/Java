class X {       }

class A {
    public static void main(String[] args) {
        // as in normal class we can create multiple instances
        X x1 = new X();
        X x2 = new X();

        System.out.println(x1);
        System.out.println(x2);
    }
}