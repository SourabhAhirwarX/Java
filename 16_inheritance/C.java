class X {

}

class A extends X {
    public static void main(String[] args) {
        A x = new A();
        System.out.println(x.toString());
        System.out.println(x.hashCode());

        X a = new X();
        System.out.println(a.toString());
        System.out.println(a.hashCode());
    }
}