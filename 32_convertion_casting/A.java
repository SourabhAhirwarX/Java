class A {
    public static void main(String[] args) {
        int x = 20;  //20 is an int constant
        char y = 'A'; //'A' is a char constant
        float z = 2.3f;  //2.3f is a float constant

        //The type of the value and the type of the variable is 
        //same thus no conversion required...


        char a = (char)2523.35f;    // narrowing conversion
        System.out.println(a);
    }
}