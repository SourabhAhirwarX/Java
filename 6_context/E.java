class A {
    static int x = 90; // class level variable

    public static void main(String[] args) {
        System.out.println(x);
        pro();
    } 

    // class level member method
    static void pro() {
        System.out.println("Hello");
    }
}