class A {
    static String x;
    public static void main(String[] args) {
        System.out.println("A");
        
        System.out.println(x.length());     // Exception in thread "main" java.lang.NullPointerException
                                            // at A.main(B.java:6)

        System.out.println("A");
    }
}