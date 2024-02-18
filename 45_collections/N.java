/*
    HashMap implementation, iterating over the HashMap

    we can only iterate over the Iterable implementing classes/interface only using enhance for loop.
    for maps we can't use for each loop(enhance for loop).
*/

import java.util.HashMap;
import java.util.Set;

class A {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(12, "mohan");
        map.put(13, "sohan");
        map.put(14, "rohan");
        map.put(15, "gohan");
        map.put(16, "iohan");

        Set set = map.keySet();

        // as we can iterate over set because, it impelements Iterable interface
        for(Object tmp : set) {
            System.out.println(tmp);
        }
    }
}