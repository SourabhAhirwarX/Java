class A {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("A");
        pro();
    }

    static void pro() throws ClassNotFoundException {
        System.out.println("B");
        info();
    } 

    static void info() throws ClassNotFoundException {
        System.out.println("C");
        Class.forName("Golu");
    }
}