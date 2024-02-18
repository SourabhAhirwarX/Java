// double - 8bytes - 64bits 
// 1.7e−308 to 1.7e+308

class A {
    public static void main(String[] args) {
        // double x = 2.3;
        double x = 1.7e308;
        // double x = 1.8e308;  // error: floating point number too large

        System.out.println(x);
    }
}