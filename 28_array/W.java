class A {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};
        int sum = 0;    // local level variable we must have to explicitly initialize it

        for(int y : x) {
            sum += y;
        }
        
        System.out.println("Total sum: "+sum);
    }
}