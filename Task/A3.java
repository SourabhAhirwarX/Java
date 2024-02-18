// WAP to check whether the array contains odd element or not?

class A {
    public static void main(String[] args) {
        int[] x = {24, 48, 45, 36, 18, 98};
        //int[] x = {24, 48, 44, 36, 18, 98};
        
        int k = 0;

        for(int i=0; i<x.length; i++) {
            if(x[i]%2 != 0) {
                k++;
                break;
            }
        }

        if(k>0) {
            System.out.println("Odd no. found");
        }
        else {
            System.out.println("Odd no. not found !");
        }
    }
}