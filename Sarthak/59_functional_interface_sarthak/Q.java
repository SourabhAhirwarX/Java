interface Uvw {
    void pro();
}

class A {
    public static void main(String[] args) {
        Uvw x = () -> System.out.println("Hello");

        x.pro();
    }
}