class A {
    public static void main(String[] args) {
        int[][] x = new int[][] {{1,2}, {3,4,5,6,7}, {8,9,11}};

        // using enhance for loop
        for(int[] i : x) {
            for(int j : i) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}