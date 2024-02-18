// copy the array elements in reverse order

class A {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50, 60};
        int[] y = new int[x.length];

        // type 1
        for(int i=0; i<x.length; i++) {
            y[i] = x[x.length-i-1];
            System.out.println(y[i]);
        }
        System.out.println();

        // type 2
        for(int i=0,j=x.length-1; i<x.length; i++,j--) {
            y[i] = x[j];
            System.out.println(y[i]);
        }
        System.out.println();

        // type 3
        y = x;
        for(int i=x.length-1; i>=0; i--) {
            System.out.println(y[i]);
        }
    }
}