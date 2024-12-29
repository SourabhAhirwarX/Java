final class X {
    int y = 96;
}

class A /*extends X*/ {
    public static void main(String[] args) {
        X a = new X();
        System.out.println(a.y);

        a.y = 45; 
        System.out.println(a.y);
    }
}