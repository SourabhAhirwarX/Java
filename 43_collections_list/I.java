/*
    here, we are using the remove() method of List interface in which,
        we have to pass the index from which we want to remove the element...
                            Object  ->   remove(int index)

    Conclution:- know which parameterized method to use for removal i.e. 
                collection interface =>   remove(Object o)  ->  boolean
                    List interface   =>   remove(int index) ->  Object    ///                   
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
 
        x.add(5);
        x.add(3);
        x.add(7);
        x.add(2);
        x.add(9);

        System.out.println(x);
        System.out.println(x.remove(2));       // Object -> remove(int index)
        System.out.println(x);
    }
}