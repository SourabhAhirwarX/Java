class A {
    public static void main(String[] args) {
        // Case1: String->methods(.length(), .isEmpty())
        String x = "";
        // String x = "Shyam";
        System.out.println(x.length());     // to check the length of the string. 
        System.out.println(x.isEmpty());    // to check whether the string is empty or not.
        System.out.println(x.isBlank());    // launched from java 11

        //Case2: Array->properties(.length)
        int[] y = {45, 18, 17};
        System.out.println(y.length);           // to check the length of array of int variable
        //System.out.println(y.length());       // error: cannot find symbol, we can't call the length as a method in the int case
    }
}