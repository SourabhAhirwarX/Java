/*

*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        char[] x = {'T', 'e', '8', 'E'};

        for(char n : x) {
            System.out.println(n);
        }

        System.out.println("~~~~~~");
        
        Arrays.sort(x);

        for(char n : x) {
            System.out.println(n);
        }
    }
}