class A {
    A(String... y) {
        System.out.println(y.length);
    }

    public static void main(String[] args) {
        // A y = new A();
        // A y = new A("mohan");
        // A y = new A("mohan", "rohan", "sohan");

        String[] arr = {"ram", "om", "chapri", "vigyan"};
        A y = new A(arr);
    }
}