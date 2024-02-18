// WAP to find the average of all the elements in the given array?

class A {
    public static void main(String[] args) {
        int[] x = {23, 43, 34, 67, 24, 90};
        int sum = 0;
        float avg;

        for(int i=0; i<x.length; i++) {
            sum = sum + x[i];
        }

        avg = (float)sum/x.length;
        System.out.println(avg);
    }
}