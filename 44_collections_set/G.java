// Traversing the elements of the set using iterator() method...

import java.util.HashSet;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(23);
        set.add(45);
        set.add(18);
        set.add(17);
        set.add(99);
        set.add(15);

        Iterator itr = set.iterator();

        while(itr.hasNext()) {         
            System.out.println(itr.next());
            // System.out.println(itr.next().floatValue());        // error: cannot find symbol
        }
    }
}