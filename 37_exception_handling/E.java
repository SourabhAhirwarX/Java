class A {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            int x = 12/0;
        } catch (ArithmeticException e) {
            
        }

        System.out.println("B");
    }
}