class A {
    public static void main(String[] args) {
        pro();
    }

    static void pro() {
        try {
            throw new ArithmeticException();
        } finally {
            throw new NullPointerException();
        }
    }      
}