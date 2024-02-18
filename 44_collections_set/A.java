// Neither ordered nor Sorted...

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        // add method of collection interface...
        set.add(23);
        set.add(45);
        set.add(18);
        set.add(5);
        set.add(17);

        System.out.println(set);
    }
}