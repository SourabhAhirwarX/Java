// Duplicate records not alloweded + neither ordered nor sorted ...

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();

        set.add("mohan");
        set.add("rohan");
        set.add("sohan");
        set.add("gohan");
        set.add("tohan");
        set.add("mohan");   // duplicate

        System.out.println(set);
    }
}