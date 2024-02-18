/*

*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("umesh");
        set.add("mayank");
        set.add("om");
        set.add("yam");
        set.add("indr");
        set.add("kapil");

        System.out.println(set);

        // values before this
        System.out.println(set.headSet("pankaj"));
        System.out.println(set.headSet("mayank"));

        // values after this
        System.out.println(set.tailSet("naresh"));
        System.out.println(set.tailSet("mayank"));
    }
}