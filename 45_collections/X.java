/*
    Ordered countor part of HashMap
*/

import java.util.LinkedHashMap;

class A {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

        map.put("golu", 12);
        map.put("bholu", 17);
        map.put(null, 11);
        map.put("tolu", null);

        System.out.println(map);
    }
}