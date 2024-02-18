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
        set.add("yam");
        set.add("indr");
        set.add("kapil");

        System.out.println(set);

        System.out.println(set.ceiling("narad"));
        System.out.println(set.ceiling("bhemm"));
        System.out.println(set.ceiling("yashit"));    
    }
}