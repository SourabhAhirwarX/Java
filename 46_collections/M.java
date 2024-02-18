/*

*/

import java.util.ArrayList;
import java.util.Collections;

class A {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mohan");
        list.add("rohan");
        list.add("tohan");
        list.add("sohan");
        list.add("gohan");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}