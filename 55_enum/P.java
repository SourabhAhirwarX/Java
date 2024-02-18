enum CoffeeSize {
    SMALL(150), MEDIUM(300), LARGE(500);

    int ml;

    CoffeeSize(int ml) {
        this.ml = ml;
    }

    int getML() {
        return ml;
    }
}

class A {
    public static void main(String[] args) {
        CoffeeSize[] cz = CoffeeSize.values();

        for(CoffeeSize cs : cz) {
            System.out.println(cs.getML());
        }
    }
}