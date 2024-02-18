/*
    here, we are creating the list of different collection i.e. classes and interface like ArrayList, LinkedList, Vector, Stack, Queue...
    using different methods of these collections we can add, remove and iterate between the list...

    Conclution:- uses the methods of same class/interface for their proper functioning.

    Vector is same like the ArrayList-
    the only edge is that Vector is Thread safe countor part of ArrayList
    all the key methods are synchronized
    and vector grows with 100%.
    rest other properties were same as ArrayList.
*/

import java.util.Vector;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        Vector list = new Vector();

        list.add(34);
        list.add(45);
        list.add(18);
        list.add(24);

        Iterator itr = list.iterator();

        while(itr.hasNext()) {
            int str = (int)itr.next();
            System.out.println(str);
        }

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.remove(0));
        System.out.println(list.contains(18));
        System.out.println(list.remove(0));
    }
}