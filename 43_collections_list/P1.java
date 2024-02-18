/*  
    here, we wan't to get the length of each element the list contains...
    we are using iterator() method for for iterating the different elements of list
                    Iterator<E>  ->  iterator()
        where, hasNext() it only checks the condition whether the list contains any element or not 
        and it will return boolean value i.e. list has left with any element or not, it will called on the iterator object
                        boolean  ->  hasNext() 
        and next() method will always points to the next element of the list  
                            E    ->  next()

    Conclution:-    itr.hasNext() -> condition checking
                    itr.next()    -> points to next element 
*/

import java.util.ArrayList;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new String("#mohan"));
        x.add(new String("#rohan"));
        x.add(new String("#sohan"));
        x.add(new String("#tohan"));
        x.add(new String("#gohan"));

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            // System.out.println(itr.next().length());        // error: cannot find symbol
            System.out.println(((String)itr.next()).length());
        }
    }
}