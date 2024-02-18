// float - 4 bytes - 32 bits 
// 3.4e−038 to 3.4e+038

class A {
    public static void main(String[] args) {
        // float x = 2.3f;
        // float x = 2.3e3f;

        // float x = 3.4e-38f;
        float x = 3.45e-37f;
        // float x = 3.42e38f;  // error: floating point number too large

        System.out.println(x);
    }
}