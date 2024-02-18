class A {
    public static void main(String[] args) {
        String s = "om is my friend and he is a singer and he is a criketer";

        int n = s.length();

        while((n = s.lastIndexOf("is", n-1)) != -1) {
            System.out.println(n);
        }
    }
}