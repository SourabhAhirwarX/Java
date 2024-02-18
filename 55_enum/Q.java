enum CoffeeSize {
    SMALL(150,"SM"), MEDIUM(300,"MD"), LARGE(500,"LG");

    int ml;
    String label;

    CoffeeSize(int ml, String label) {
        this.ml = ml;
        this.label = label;
    }

    int getML() {
        return ml;
    }

    String getLabel() {
        return label;
    }
}

class A {
    public static void main(String[] args) {
        CoffeeSize[] cz = CoffeeSize.values();

        for(CoffeeSize cs : cz) {
            System.out.println(cs.getML()+" - "+ cs.getLabel());
        }
    }
}