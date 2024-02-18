class A {
    public static void main(String[] args) {
        int[] x = {12, 45, 78, 34, 55, 21, 12, 9, 23, 78, 120, 69, 12, 45};

        for(int y : x) {
            if(y%2 == 0) {
                System.out.println(y + " even");
            } else {
                System.out.println(y + " odd");
            }
        }
    }
}