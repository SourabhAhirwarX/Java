class A {
    public static void main(String[] args) {
        try {
            int[] x = {12, 13, 15};
            System.out.println(x[3]);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("IOBE");
        } catch(ArrayIndexOutOfBoundsException e) {   //error: exception ArrayIndexOutOfBoundsException has already been caught
            System.out.println("ARIIOBE");
        }
    }
}