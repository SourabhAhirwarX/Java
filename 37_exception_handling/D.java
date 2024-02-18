class A {
    public static void main(String[] args) {
        System.out.println("A");

        System.out.println(args[0]);    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
                                        // at A.main(D.java:5)

        System.out.println("B");
    }
}