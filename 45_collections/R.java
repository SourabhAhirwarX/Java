/*
    key and value both can be null
    in case of HashMap
*/

import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(12, "mohan");
        map.put(null, "gohan");
        map.put(13, "null");
        map.put(14, "sohan");

        System.out.println(map);   
    }
}