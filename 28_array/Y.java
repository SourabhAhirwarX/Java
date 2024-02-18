import java.util.Set;
import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        char[] x = {'x', 'o', 'h', 'a', 'n', ' ', 'i', 's', ' ', 'a', ' ', 'g', 'o', 'o', 'd', ' ', 'b', 'o', 'y'};
        char[] y = {'a', 'e', 'i', 'o', 'u'};

        // for(char t : y) {
        //     int count = 0;
        //     for(char n : x) {
        //         if(t == n) {
        //             count++;
        //         }
        //     }

        //     if(count != 0) {
        //         System.out.println(t + " - " + count);
        //     }
        // }

        vowelCountHashing(x, y);
    }


    public static void vowelCountHashing(char[] arr, char[] vow) {
        TreeMap<Character, Integer> mapVowels = new TreeMap<>();
        for(int i=0; i<vow.length; i++) {
            mapVowels.put(vow[i], 1);
        }

        TreeMap<Character, Integer> map = new TreeMap<>();

        for(int i=0; i<arr.length; i++) {
            if(mapVowels.containsKey(arr[i])) {
                if(map.containsKey(arr[i])) {
                    int temp = map.get(arr[i]);
                    map.put(arr[i], temp+1);
                } else {
                    map.put(arr[i], 1);
                }
            }
        }

        Set<Character> set = map.keySet();
        for(Character c : set) {
            System.out.println(c + " -> " + map.get(c));
        }
    }
}