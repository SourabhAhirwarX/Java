import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {45, 23, 8, 32, 19};         

        Arrays.sort(x);

        // int n = Arrays.binarySearch(x, 19);
        int n = Arrays.binarySearch(x, 32);
        // int n = Arrays.binarySearch(x, 23);
        
        System.out.println(n);
    }
}