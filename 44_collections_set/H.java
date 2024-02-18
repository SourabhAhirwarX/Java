// removing an element from the list using the remove method of Collection interface...

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(23);
        set.add(45);
        set.add(18);
        set.add(17);
        set.add(99);
        set.add(15);

        System.out.println(set);
        
        // remove(Object o) method of Collection interface was called.
        Integer x = Integer.valueOf(12);
        System.out.println(set.remove(x));
        
        System.out.println(set.remove(2));
        System.out.println(set.remove(39));
        System.out.println(set.remove(18));
        
        System.out.println(set);
    }
}