class A {
    public static void main(String[] args) {
        int[] x = {1, 3, 4, 5, 6, 7, 8};
        // shortcut technique, on the fly array object creation

        for(int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
}