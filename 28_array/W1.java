class A {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50, 60, 70};
        int sum = 0;

        for(int y : x) {
            sum += y;
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Avg: " + ((float)sum/x.length));
    }
}