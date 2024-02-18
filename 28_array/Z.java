// copy elements of an array

class A {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50, 60};
        int[] y = new int[x.length];

        // approach 1
        for(int i=0; i<x.length; i++) {
            y[i] = x[i];
        }

        for(int t : y) {
            System.out.println(t);
        }

        // approach 2
        y = x;
    }
}