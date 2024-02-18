class A {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            System.out.println("B");
        }
        System.out.println("C");
        catch(ArithmeticException e) {
            System.out.println("D");
        }
        System.out.println("E");
    }
}