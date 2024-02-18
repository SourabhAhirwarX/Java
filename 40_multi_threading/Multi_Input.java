import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // aam zindagi
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();

        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // mentos zindagi
        for(int i=0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : arr) {
            System.out.println(x);
        }

        sc.close();
    }
}