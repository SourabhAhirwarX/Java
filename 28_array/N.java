// Q. find the minimum no. from the given array?

class A {
    public static void main(String[] args) {
        int[] x = {45, 67, 12, 55, 23, 89};

        int min = x[0];

        for(int i=1; i<x.length; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }

        System.out.println(min);
    }
}