/*
    here, we are creating the object of class ArrayList,
    and by using import statement we are importing ArrayList class which is present in the util package
    since, ArrayList is class of util package so we must have to import it...
    and then, by using add() method we are adding new values to the list...

    All reference variable are of object type variable...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();       

        list.add(12);
        list.add("golu");
        list.add(45.18);

        System.out.println(list);
    }
}