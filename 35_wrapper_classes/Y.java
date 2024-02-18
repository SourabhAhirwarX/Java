class A {
    public static void main(String[] args) {
        // Integer x = Integer.valueOf(23);
        // Integer y = Integer.valueOf(23);

        // Integer x = Integer.valueOf(127);
        // Integer y = Integer.valueOf(127);
        
        // Integer x = Integer.valueOf(128);
        // Integer y = Integer.valueOf(128);

        // Integer x = Integer.valueOf(-128);
        // Integer y = Integer.valueOf(-128);
        
        Integer x = Integer.valueOf(-129);
        Integer y = Integer.valueOf(-129);

        System.out.println(x == y);
    }
}