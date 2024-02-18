// Traversing the elements of the set

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("mohan");
        set.add("rohan");
        set.add("sohan");
        set.add("gohan");
        set.add("tohan");

        for(Object tmp : set) {         
            System.out.println(tmp + " ~ ");
            // System.out.println(tmp.length());       // error: cannot find symbol
        }
    }
}