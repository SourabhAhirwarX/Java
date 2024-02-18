// Duplicate records not alloweded...
// interanally removes the duplicated record.

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(23);
        set.add(45);
        set.add(18);
        set.add(17);
        set.add(23);        // duplicate
        set.add(18);        // duplicate
        set.add(63);

        System.out.println(set);
    }
}