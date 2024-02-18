// Traversing(Iterating) over the elements of the set

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("mohan");
        set.add("rohan");
        set.add("sohan");
        set.add("gohan");
        set.add("tohan");

        for(String tmp : set) {          // error: incompatible types: Object cannot be converted to String
            System.out.println(tmp);
        }
    }
}