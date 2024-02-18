/*

*/

import java.util.Hashtable;

class A {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<String, Integer>();

        map.put("gonu", 12);
        map.put("bholu", 17);
        map.put(null, 11);      // Exception in thread "main" java.lang.NullPointerException
        map.put("bholu", null);

        System.out.println(map);
    }
}