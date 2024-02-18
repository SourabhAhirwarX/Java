/*


*/

import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        
        map.put("golu", 12);
        map.put("bholu", 17);
        map.put("tolu", 13);

        String x = new String("bholu");

        System.out.println(map);

        System.out.println(map.containsKey(x));
        System.out.println(map.remove(x));
        
        System.out.println(map);
    }
}