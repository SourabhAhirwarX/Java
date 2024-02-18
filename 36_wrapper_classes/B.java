class A {
    public static void main(String[] args) {
        //Case 1:
        // long j = 24;
        // Long x = Long.valueOf(j);
        // Long y = Long.valueOf(j);

        //Case 2:
        Long x = Long.valueOf(128);
        Long y = Long.valueOf(128);

        System.out.println(x == y);
    }
}