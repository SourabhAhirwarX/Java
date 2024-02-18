class A {
    public static void main(String[] args) {
        //Case 1:
        // short j = 34;
        // Short x = Short.valueOf(j);
        // Short y = Short.valueOf(j);

        short j = -129;
        Short x = Short.valueOf(j);
        Short y = Short.valueOf(j);

        System.out.println(x == y);
    }
}