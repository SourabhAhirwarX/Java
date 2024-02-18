// Implementing contains method of Collection interface Only...

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(23);
        set.add(45);
        set.add(18);
        set.add(17);
        set.add(99);
        set.add(15);

        // Integer y = new Integer();        // depricated can't be used
        Integer x = Integer.valueOf(23);

        System.out.println(set);
        System.out.println(set.contains(x));
        System.out.println(set);
    }
}