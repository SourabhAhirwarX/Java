/*
    LinkedHashSet :- ordered countor part of hashSet
    it will store the data in the order in which it was added 
*/

import java.util.HashSet;
import java.util.LinkedHashSet;

class A {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<Integer>();

        hset.add(45);
        hset.add(73);
        hset.add(9);
        hset.add(32);
        hset.add(73);

        System.out.println(hset);

        LinkedHashSet<Integer> Lset = new LinkedHashSet<Integer>();

        Lset.add(45);
        Lset.add(73);
        Lset.add(9);
        Lset.add(32);
        Lset.add(73);

        System.out.println(Lset);
    }
}