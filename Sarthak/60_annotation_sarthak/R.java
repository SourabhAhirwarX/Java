@FunctionalInterface
interface H {
    void pro();
}

class A {
    public static void main(String[] args) {
        H h = () -> System.out.println("Hello");

        h.pro();
    }
}