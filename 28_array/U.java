import java.util.Scanner;

class A {
    public static void main(String[] args) {
        int[] x = {12, 45, 78, 34, 55, 21, 12, 9, 23, 78, 120, 69, 12, 45};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.: ");
        int val = sc.nextInt();
        
        sc.close();

        for(int y : x) {
            if(y == val) {
                System.out.println("Record found");
            } else {
                System.out.println("Record not found!");
            }
        }
    }
}