import java.util.HashMap;
import java.util.Set;

public class I1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(1, 2);
        map.put(2, 0);
        map.put(0, 6);
        map.put(5, 3);
        map.put(3, 1);
        map.put(4, 2);

        int max = 0;
        int elm = 0;
    
        Set<Integer> set = map.keySet();

        for(Integer i : set) {
            if(max < map.get(i)) {
                max = map.get(i);
                elm = i;
            }
        }

        System.out.println(elm);
    }
}