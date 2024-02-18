class A {
    public static void main(String[] args) {
        String x = String.join("~", "bholu", "golu", "molu");
        String y = String.join(",", "bholu", "golu", "molu");
        String z = String.join(", ", "bholu", "golu", "molu");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}