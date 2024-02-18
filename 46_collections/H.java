/*

*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("umesh");
        set.add("mayank");
        set.add("om");
        set.add("bheem");
        set.add("indr");
        set.add("kapil");

        System.out.println(set);

        System.out.println(set.floor("bodhi"));
        System.out.println(set.floor("aman"));
    }
}