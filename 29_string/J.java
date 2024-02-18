class A {
    public static void main(String[] args) {
        String x = new String("Golu");
        String y = "Golu";
        String z = "Bholu";

        System.out.println(x == y);             // false
        System.out.println(x.equals(y));        // true, equals checks the content in it.

        System.out.println();
        
        System.out.println(x == z);             // false
        System.out.println(x.equals(z));       // false
        System.out.println(y.equals(z));      // false
    }
}