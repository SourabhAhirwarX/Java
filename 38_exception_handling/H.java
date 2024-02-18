class A {
    public static void main(String[] args) {
        // throw new ArithmeticException();    // error: unreachable statement
        // throw new NullPointerException();

        try {
            throw new Exception();
        } catch(Exception e) {
            System.out.println("Exception");
        }
    }
}