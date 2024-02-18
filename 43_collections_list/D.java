/*
    here, 
    ArrayList supports duplicate values.
    in lists we can store Duplicate values as well.
    therfore, list will store the same String values i.e. "sohan"....
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        String str = "golu";
        // String str = new String("golu");

        list.add(str);
        list.add("rohan");
        list.add("mohan");
        list.add("sohan");

        System.out.println(list);
    }
}