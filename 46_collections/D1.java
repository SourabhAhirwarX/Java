/*

*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // here we don't provided the type safety

        list.add(45);
        list.add(17);
        list.add(18);
        list.add(99);
        list.add(1);

        System.out.println(list);

        Integer[] w = new Integer[0];
        Integer[] x = list.toArray(w);      // error: incompatible types: Object[] cannot be converted to Integer[]

        for(Integer tmp : x) {
            // System.out.println(tmp);
            System.out.println(tmp.floatValue());
        }
    }
}