class A {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        try {
            int y = 12/0;
        } catch(ArithmeticException e) {
            System.out.println("AE");
        }

        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        try {
            System.out.println(args[0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOOBE");
        }

        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        try {
            String str = null;
            System.out.println(str.length());
        } catch(NullPointerException e) {
            System.out.println("NPE");
        }

        System.out.println(10);
        System.out.println(11);
        System.out.println(12);
    }
}