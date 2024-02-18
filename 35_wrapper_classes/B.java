class A {
    public static void main(String[] args) {
        Boolean x = Boolean.valueOf(true);
        System.out.println(x);

        Boolean y = Boolean.valueOf(false);
        System.out.println(y);

        Boolean z = Boolean.valueOf(0);     // error: no suitable method found for valueOf(int)
        System.out.println(z);
    }
}