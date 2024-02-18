// input nothing, 0, 1, 2, 3, 4...

class A {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
            int i = Integer.parseInt(args[0]);

            System.out.println(3);
            String[] x = {"golu", "simba", null, "raju"};
            
            System.out.println(4);
            System.out.println(x[i].length()+"~");
            
            System.out.println(5);
            int y = 12/i;
            
            System.out.println(6);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOOBE");
        } catch(NumberFormatException e) {
            System.out.println("NFE");
        } /*catch(NullPointerException e) {
            System.out.println("NPE");
        }*/ catch(ArithmeticException e) {
            System.out.println("NPE");
        } finally {
            System.out.println("---Essential Code---");
        }

        System.out.println(7);
    }
}