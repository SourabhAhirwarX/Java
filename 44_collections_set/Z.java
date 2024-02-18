/*
    TreeSet:- float values are also sorted in order
    any type of data will we stored in sorted way
*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(47.32);
        set.add(45.18);
        set.add(17.99);
        set.add(9.11);
        set.add(78.22);
        set.add(23.67);

        System.out.println(set);
    }
}