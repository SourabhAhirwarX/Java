class A {
    public static void main(String[] args) {
        String x = "12345";

        char[] arr = x.toCharArray();

        for(int i : arr) {
            System.out.println((char)i);
        }
    }
}