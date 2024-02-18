class A {
    public static void main(String[] args) {
        try {
            Class klass = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println("NFE");
        }
    }
}