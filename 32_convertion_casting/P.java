class A {
    public static void main(String[] args) {
        // Case 1:
        // double x = 'A';
        // double x = (double) 'B';

        // Case 2:
        double x = 65.0;
        // char y = x;     // error: incompatible types: possible lossy conversion from double to char
        char y = (char) x;

        System.out.println(y);
    }
}