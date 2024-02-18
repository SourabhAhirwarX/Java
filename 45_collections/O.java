/*

*/

import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(12, "monu");
        map.put(13, "arun");
        map.put(12, "monu");

        System.out.println(map);
    }
}