/*
    providing the compile time safety
*/

import java.util.HashMap;
import java.util.Set;

class A {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(12, "mohan");
        map.put(13, "sohan");
        map.put(14, "rohan");
        map.put(15, "gohan");
        map.put(16, "iohan");

        Set<Integer> set = map.keySet();

        for(Integer tmp : set) {
            System.out.println(tmp + " ~ " + map.get(tmp));
        }
    }
}