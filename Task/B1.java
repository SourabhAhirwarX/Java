// copy array in reverse order

class A {
    public static void main(String[] args) {
        int[] x = {44, 934, 34, 38, 43};
        int[] y = new int[x.length];

        for(int i=0; i<y.length; i++) {
            y[i] = x[x.length-i-1];
            System.out.println(y[i]);
        }
    }
}