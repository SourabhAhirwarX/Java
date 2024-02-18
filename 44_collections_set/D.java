// Implementing the methods of interface Collection.

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.add("mohan");
        set.add("rohan");
        set.add("sohan");
        set.add("gohan");
        set.add("tohan");

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}