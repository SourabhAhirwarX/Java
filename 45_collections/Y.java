/*
    TreeSet - Ordered and Sorted
*/

import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
        
        map1.put("golu", 12);
        map1.put("bholu", 17);
        map1.put("tolu", 13);

        TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();

        map2.put(45, "golu");
        map2.put(17, "bholu");
        map2.put(18, "tolu");

        System.out.println(map1);
        System.out.println(map2);
    }
}