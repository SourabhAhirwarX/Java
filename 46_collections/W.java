/*

*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        String[] x = {"om", "yam", "jeetu", "ronil"};

        // Object[] y = x;

        for(String n : x) {
            System.out.println(n);
        }

        System.out.println();

        Arrays.sort(x);

        for(String n : x) {
            System.out.println(n);
        }
    }
}