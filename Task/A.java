// WAP to find minimum element in the given array?

class A {
    public static void main(String[] args) {
        int[] x = {15, 45, 18, 78, 93, 35, 587, 56};

        int min = x[0];

        for(int i=1; i<x.length; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }  

        System.out.println(min);
    }
}