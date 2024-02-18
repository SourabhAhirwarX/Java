/*

*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {45, 23, 8, 32, 19};

        for(int n : x) {
            System.out.println(n);
        }

        Arrays.sort(x);

        for(int n : x) {
            System.out.println(n + "  ");
        }
    }
}