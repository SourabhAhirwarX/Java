/*
    here, we want to print the size of the list,
        for which we uses size() method (non-parameterized) of interface collection,
        where size method call on the particular object which will return the size of that particular object...

                        int  ->  size()

    Conclution:- use size() non-parameterized method for getting the size of the list.
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x.size());

        x.add(new String("mohan")); 
        x.add(new String("rohan"));
        x.add(new String("sohan"));
        x.add(new String("tohan"));
        x.add(new String("gohan"));

        System.out.println(x.size());
    }
}