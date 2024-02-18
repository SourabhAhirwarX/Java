class A {
    int[] x;

    public static void main(String[] args) {
        System.out.println(x);          
        // error: non-static variable x cannot be referenced from a static context
    }
}