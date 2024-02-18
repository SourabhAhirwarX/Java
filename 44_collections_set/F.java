// Traversing the elements of the set
// providing type safety...

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("rohan");
        set.add("sohan");
        set.add("gohan");
        set.add("tohan");

        for(String tmp : set) {         
            System.out.print(tmp + " ~ ");
            System.out.println(tmp.length());
        }
    }
}