/*

*/

import java.util.ArrayList;
import java.util.Collections;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(17);
        list.add(18);
        list.add(01);
        list.add(99);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}