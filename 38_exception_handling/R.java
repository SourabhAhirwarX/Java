import java.util.Scanner;

class A {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            int y = 12/n;
        } catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}