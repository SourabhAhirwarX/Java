class A {
    public static void main(String[] args) {
        int y = pro();
        System.out.println(y);
    }

    static int pro() {
        try {
            return 23;
        } catch(ArithmeticException e) {
            
        }
    }       // error: missing return statement
}