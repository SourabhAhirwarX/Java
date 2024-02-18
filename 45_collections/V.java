/*
    in Hashtable keys can't be null
*/

import java.util.Hashtable;

class A {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<String, Integer>();

        map.put("monu", 12);
        map.put("bholu", 13);
        map.put("monu", 15);

        System.out.println(map);
    }
}