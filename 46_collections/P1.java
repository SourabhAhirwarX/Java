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

        Collections.sort(list);

        System.out.println(list);

        System.out.println(Collections.binarySearch(list, "tohan"));
        System.out.println(Collections.binarySearch(list, "rohan"));
        System.out.println(Collections.binarySearch(list, "gohan"));
        System.out.println(Collections.binarySearch(list, "mohan"));
        System.out.println(Collections.binarySearch(list, "sohan"));
    }
}