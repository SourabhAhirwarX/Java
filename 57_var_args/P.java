class A {
    static void pro(float... x) {
        for(float t : x) {
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        pro(12, 45, 64);
    }
}