/*

*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("umesh");
        set.add("sourabh");
        set.add("mayank");
        set.add("om");
        set.add("ram");

        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());
    }
}