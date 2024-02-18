class A {
    public static void main(String[] args) {
        String s = "om is my friend and he is a singer and he is a singer and he is a cricketer";

        int n = -1;

        while((n=s.indexOf("is", n+1)) != -1) {
            System.out.println(n);
        }
    }
}