// Copy array

class A {
    public static void main(String[] args) {
        int[] x = {44, 934, 34, 38, 43};
        int[] y = new int[x.length];

        y = x;

        for(int i=0; i<y.length; i++) {
            System.out.println(y[i]);
        }
    }
}