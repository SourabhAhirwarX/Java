/* 
    Generics is basically the compile time safety.
    can be applied to a class, interface or enum, arrays, inner class, object
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        // ArrayList<Integer> x = new ArrayList<Integer>();
        // ArrayList<T> x = new ArrayList<T>();
        ArrayList<S> x = new ArrayList<S>();
        // ArrayList<U> x = new ArrayList<U>();
        // ArrayList<int[]> x = new ArrayList<int[]>();
        // ArrayList<T.W> x = new ArrayList<T.W>();
        // ArrayList<Days> x = new ArrayList<Days>();
    }
}

class T {
    class W {

    }
}

abstract class S {

}

interface U {

}

enum Days {MONDAY, SUNDAY};