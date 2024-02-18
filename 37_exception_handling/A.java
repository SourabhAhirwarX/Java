class A {
    public static void main(String[] args) {
        System.out.println("A");

        int x = 12/0;               // Exception in thread "main" java.lang.ArithmeticException: / by zero
                                    // at A.main(A.java:4)

        System.out.println("B");
    }
}