/*
    Problem:-   we want to remove all the occurence of the given variable.
    ========

    here, we are creating the object x of class ArrayList,
    and then, adding different elements to the list x.

    since, we want to delete the element 2 from the list,
        so, we have to pass the reference variable to the remove method of the connection interface...
        therefore, we have to create the object and pass the particular value we want to remove 

    conclution:-  only the first occurence will removed.
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(5);
        x.add(2);
        x.add(7);
        x.add(2);
        x.add(9);

       Integer w = Integer.valueOf(2);

        System.out.println(x);
        System.out.println(x.remove(w));
        System.out.println(x);
    }
}