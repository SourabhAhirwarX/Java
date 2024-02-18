/*

*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(17);
        list.add(18);
        list.add(99);
        list.add(1);

        System.out.println(list);

        Object[] x = list.toArray();

        for(Object tmp : x) {
            System.out.println(tmp);
            // System.out.println(tmp.shortValue());
            System.out.println(((Integer)tmp).shortValue());
        }
    }
}