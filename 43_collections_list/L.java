/*
    Problem:    want to remove the multiple occurences of the given variable from the list...
    =======


    here, we want to delete all the same records from the list,
    using while loop we can iterate the list and compare it with the element we want to remove
                        boolean  ->  remove(Object o)
    conclution:-  we can delete multiple same records also at a time...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(5);
        x.add(2);
        x.add(7);
        x.add(2);
        x.add(12);
        x.add(2);
        x.add(3);

        Integer w = Integer.valueOf(2);

        System.out.println(x);

        // it will always return true for each iteration of w for removal of particular value
        // were each iteration it will check...
        while(x.remove(w));

        System.out.println(x);
    }
}