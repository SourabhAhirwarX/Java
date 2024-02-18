enum CoffeeSize {
    SMALL(200), MEDIUM(500), LARGE(800);

    int ml;

    CoffeeSize(int ml) {
        this.ml = ml;
    }
}

class A {
    public static void main(String[] args) {
        CoffeeSize[] cz = CoffeeSize.values();

        for(CoffeeSize cs : cz) {
            System.out.println(cs.ml);
        }
    }
}