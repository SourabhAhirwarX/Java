/*
        HashMap
    - hash based collection thus provide efficient access
    - good choice for frequent insertion and deletion
    - not a good choice for frequent iteration(traversal)
    - non thread safe countour part of hashTable
    - neither ordered nor sorted
    - null is allowded as both key as well as value
*/

import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(12, "mohan");
        map.put(13, "sohan");
        map.put(14, "rohan");
        map.put(15, "gohan");
        map.put(16, "iohan");

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
    }
}