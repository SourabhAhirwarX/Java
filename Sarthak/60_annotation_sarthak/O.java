class S {
    @Deprecated
    int y;
}

class A {
    public static void main(String[] args) {
        S s = new S();

        System.out.println(s.y);
    }
}