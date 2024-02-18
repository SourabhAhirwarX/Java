/* 
    using the get() method of the Map interface
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

        for(Object tmp : set) {
            System.out.println(tmp + " ~ " + map.get(tmp));
        }
    }
}