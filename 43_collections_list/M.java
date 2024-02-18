/*
    Problem:-   we can'nt pass the index out of the size of the list
    =======

    here, we are creating the object of interface ArrayList,
    and then, adding new String objects
                    Object  ->  get(int index)
    since, get() method is the part of List interface int parameterized which will return the Object at the parameter index passed...
    and outside the limit will generates Exception : IOOBE

    Conclution:- using get() method we can get the value at particular index we have passed...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new String("mohan"));
        x.add(new String("rohan"));
        x.add(new String("sohan"));
        x.add(new String("tohan"));
        x.add(new String("gohan"));

        System.out.println(x);

        // we have the get() method in the List interface which will return the object.
        // here we are getting the value at index 2...
        // System.out.println(x.get(2));
 
        // outside the limit it will generate Exception IOOBE...
        System.out.println(x.get(20));                  // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 20 out of bounds for length 5

        System.out.println(x);
    }
}