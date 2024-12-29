class X {
    // compiler won't provide constructor if developer created his/her own constructor...
    X(int a) {

    }

    public static void main(String[] args) {
        // new X();        // error: constructor X in class X cannot be applied to given types;
                        // required: int
                        // found: no arguments

        new X(12);
    }
}