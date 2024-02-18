/*

*/

import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        System.out.println(map.put(12, "monu"));
        System.out.println(map.put(15, "arun"));
        System.out.println(map.put(12, "ajju"));

        System.out.println(map);
    }
}