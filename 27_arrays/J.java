class A {
    public static void main(String[] args) {
        String[] x = new String[2];

        System.out.println(x.length);   // length property of array

        System.out.println(x[0]);
        System.out.println(x[1]);

        x[0] = "mohan";
        x[1] = "gopal";
        
        System.out.println(x[0]);
        System.out.println(x[0].length());  // length method of String class
        System.out.println(x[1]);
    }
}