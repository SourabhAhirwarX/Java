class A {
    public static void main(String[] args) {
        byte a = pro();
        System.out.println(a);
    }

    static byte pro() {
        int a = 4;

        // return a;
        return (byte)a;
        // return 2;
    }
}