// input: <no arg>, z, 0, 1, 2

class A {
    public static void main(String[] args) {
        System.out.println(1);
        
        try {
            int x = Integer.parseInt(args[0]);
            
            System.out.println(2);
            int[] arr = {4, 0, 3};
            System.out.println(arr[x]);
            
            System.out.println(3);
            int y = 12/arr[x];
            System.out.println(4);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOBE");
        } catch(NumberFormatException e) {
            System.out.println("NFE");
        } catch(ArithmeticException e) {
            System.out.println("AE");
        }

        System.out.println(5);
    }
}