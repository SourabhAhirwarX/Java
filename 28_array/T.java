class A {
    public static void main(String[] args) {
        String[][][] x = new String[2][3][2];

        for(String[][] i : x) {
            for(String[] j : i) {
                for(String k : j) {
                    System.out.print(k+" ");
                }
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}