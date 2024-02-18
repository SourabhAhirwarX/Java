class A {
    public static void main(String[] args) throws ClassNotFoundException {
        pro();
        System.out.println("A");
    }

    static void pro() throws ClassNotFoundException {
        info();
        System.out.println("B");
    } 

    static void info() throws ClassNotFoundException {
        Class.forName("Golu");
        System.out.println("C");
    }
}