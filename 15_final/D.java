final class X {
    int y = 90;
}

class A /*extends X*/ {
    public static void main(String[] args) {
        X a = new X();  // access through instantiation

        System.out.println(a.y);
    }
}