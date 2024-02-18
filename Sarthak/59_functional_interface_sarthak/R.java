interface Uvw {
    void pro();
}

class A {
    public static void main(String[] args) {
        Uvw x = () -> System.out.println("Hello");
        Uvw y = () -> System.out.println("Hi");

        x.pro();
        y.pro();
    }
}