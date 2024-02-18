/*
    Problem: want to iterate over the elements the list contains...
    =======
    
    here, we are creating the object of interface ArrayList,
    and then, adding new String objects
                    Object  ->  get(int index)
    since, get() method is the part of List interface, int parameterized which will return the Object at the parameter index passed...
    and outside the limit it will generate Exception : IOOBE

    using classical for loop we can iterate all the elements of the list  =>  x.get(i)
                    error: array required, but ArrayList found  =>  x[i]

    Conclution:- using get() method inside loop we can read all the elements of the list...
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

        for(int i=0; i<x.size(); i++) {
            // System.out.println(x[i]);           // error: array required, but ArrayList found
            System.out.println(x.get(i));
        }
        
        System.out.println(x);
    }
}