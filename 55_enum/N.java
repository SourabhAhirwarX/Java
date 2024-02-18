enum CoffeeSize {
    SMALL, MEDIUM, LARGE
}

class A {
    public static void main(String[] args) {
        CoffeeSize cs = new CoffeeSize();

        System.out.println(cs);
    }
}

// error: enum types may not be instantiated