class A {
    public static void main(String[] args) {
        try {
            // we can write a problem generating code(risky code), 
            // in other words code which may generate problem can be written here

            // code which dependent on problem generating code
        } catch(ArithmeticException e) {
            // problem solving code...
        } finally {
            // essential code...
        }
    }
}