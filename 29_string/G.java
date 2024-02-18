class A {
    public static void main(String[] args) {
        String x = new String("bholu");
        String y = new String("bholu");

        System.out.println(x == y);       
        // reference code can never be same, it means == equals checks whether the variables are pointing to same object or not
    }
}