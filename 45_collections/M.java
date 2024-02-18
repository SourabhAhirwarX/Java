/*

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

        for(Object tmp: map) {          //  error: for-each not applicable to expression type
            System.out.println(tmp);
        }
    }
}