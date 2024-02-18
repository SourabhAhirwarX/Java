class A {
    public static void main(String[] args) {
        int[] x;                        // declaration
        x = new int[]{45, 18, 17, 99};  // instantiation cum initialisation

        for(int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
}