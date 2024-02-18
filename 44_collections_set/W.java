/*
    TreeSet :- Ordered and Sorted...
*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(45);
        set.add(90);
        set.add(63);
        set.add(8);
        set.add(23);
        set.add(90);
        set.add(12);

        System.out.println(set);
    }
}