class A {
    public static void main(String[] args) {
        // single string object will be created in string constant poll
        // and the reference variable points to the same object in the case of string literals assignment
        // but in case of instantiation new objects will be created in heap area for each variable uniquely
        String x = "om";
        String y = "om";
        String z = "om";

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}