class A {
    public static void main(String[] args) {
        // throw new ArithmeticException();
        // throw new NullPointerException();

        try {
            throw new Exception();
        } catch(Exception e) {
            System.out.println("Exception");
        }

        // throw new Error();  
        throw new Object();   // error: incompatible types: Object cannot be converted to Throwable
    }
}