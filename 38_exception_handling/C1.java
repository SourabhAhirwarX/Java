class A {
    public static void main(String[] args) {
        try {
            int[] x = {12, 13, 15};
            System.out.println(x[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOOBE");
        } catch(IndexOutOfBoundsException e) {   
            System.out.println("IOOBE");
        }
    }
}