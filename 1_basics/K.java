/*
    we can create variables in 3 levels:
        1. instance level variable
        2. class level variable
        3. local level variable
*/

class A {
    // instance level variables - (non static variables which belongs to the object)
    int x;       // x is a primitive type variable, because int is of primitive type
    String y;    // y is a class type variable, because String is a class
    Integer a;   // Integer is a wrapper class object type variable
 
    // class level variables - (static varibles which belongs to class)
    // mark those fields as static which are commonly accessible.
    static float z;  // z is a primitive type variable, because float is a primitive type, as we marked it as static so, it act as a class level variable, where only once the object will created.
    static String e; // e is a class type variable, because String is a class

    void pro() {
        // local level variables
        char t;    // t is a primitive type variable, because char is a primitive type, since it was created inside method which have local level scope
        String j;  // j is a class type variable, because String is a class
    }

    A() {
        // local level variables
        short q;
        Integer w;
    }

    // static keyword not applicable on local level variables
}