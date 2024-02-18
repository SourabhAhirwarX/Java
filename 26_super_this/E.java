class A {
    public static void main(String[] args) {
        X g = pro();
        System.out.println(g);
    }

    static X pro() {
        X a = new X();
        System.out.println(a + "~~~");
        return a;
    }
}

class X {

}