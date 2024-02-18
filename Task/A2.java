// WAP to find the no. of even element in the given array?

class A {
    public static void main(String[] args) {
        int[] x = {23, 54, 67, 68, 45, 61, 82, 46, 70};
        int count = 0;

        for(int i=0; i<x.length; i++) {
            if(x[i]%2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}