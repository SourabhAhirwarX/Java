class A {
    public static void main(String[] args) {
        String x = new String("mohan");
        String y = new String("MOHAN");

        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));
    }
}