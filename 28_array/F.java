// find the maximum element from the given array

class A {
    public static void main(String[] args) {
        int[] x = {45, 18, 72, 11, 19};

        int max = x[0];

        for(int i=1; i<x.length; i++) {
            if(x[i]>max) {
                max = x[i];
            }
        }
        
        System.out.println(max);
    }
}