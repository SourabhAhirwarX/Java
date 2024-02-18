/*
    
*/

import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(12, "mohan");
        map.put(17, "gohan");
        map.put(13, "rohan");
        map.put(14, "sohan");

        System.out.println(map.containsKey(20));
        System.out.println(map.containsKey(17));
    }
}