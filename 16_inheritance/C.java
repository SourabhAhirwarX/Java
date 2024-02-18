class X {

}

class A extends X {
    public static void main(String[] args) {
        A x = new A();
        System.out.println(x.toString());
        System.out.println(x.hashCode());
        System.out.println(x.getClass());

        X a = new X();
        // System.out.println(a);
        System.out.println(a.toString());
        System.out.println(a.hashCode());
        System.out.println(a.getClass());
    }
}