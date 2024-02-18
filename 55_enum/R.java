class A {
    static enum CoffeeSize {
        SMALL, MEDIUM, LARGE
    }

    public static void main(String[] args) {
        CoffeeSize cs = CoffeeSize.LARGE;

        System.out.println(cs);
    }
}