class A {
    // instance level variables
    int x;       // x is a primitive type variable, because int is a primitive type
    String y;    // y is a class type variable, because String is a class
 
    // class level variables
    static float z;  // z is a primitive type variable, because float is a primitive type
    static String e; // e is a class type variable, because String is a class

    void pro() {
        // local level variables
        char t;    // t is a primitive type variable, because char is a primitive type
        String j;  // j is a class type variable, because String is a class
    }

    A() {
        // local level variables
        short q;
        Integer w;
    }

    // static keyword not applicable on local level variables
}