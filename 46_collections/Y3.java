/*

*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        String[] x = {"om", "yam", "jeetu", "ronil"};

        Arrays.sort(x);
        System.out.print(Arrays.binarySearch(x, "sahil"));
    }
}