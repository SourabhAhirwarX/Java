/*

*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        char[] x = {'T', 'e', '8', 'E'};

        Arrays.sort(x);

        System.out.println(Arrays.binarySearch(x, 'e'));
        System.out.println(Arrays.binarySearch(x, '8'));
        System.out.println(Arrays.binarySearch(x, 'E'));
        System.out.println(Arrays.binarySearch(x, 'T'));
    }
}