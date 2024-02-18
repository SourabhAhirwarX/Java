final class X {
    static int y = 96;
}

class A /*extends X*/ {
    public static void main(String[] args) {
        System.out.println(X.y);
    }
}