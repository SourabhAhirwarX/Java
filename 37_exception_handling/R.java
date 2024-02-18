class A {
    public static void main(String[] args) {
        Class klass = Class.forName("java.lang.String");    // error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
    }
}