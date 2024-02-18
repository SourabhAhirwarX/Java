import java.util.Scanner;

class A {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a no.: ");
            int n = sc.nextInt();

            int y = 23/n;

            System.out.println(y);
        } catch(ArithmeticException e) {
            throw new IllegalArgumentException();
        }
    }
}