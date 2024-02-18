/*
    the binary Search must be implemented on a sorted list
    { -(ins.point) - 1}
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

        System.out.println(Collections.binarySearch(list, "nohan"));
        System.out.println(Collections.binarySearch(list, "pohan"));
        System.out.println(Collections.binarySearch(list, "hohan"));
        System.out.println(Collections.binarySearch(list, "eohan"));
    }
} 