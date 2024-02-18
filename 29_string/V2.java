class A {
    public static void main(String[] args) {
        String x = "Hey Every One Whatsup!";

        int n = -1;

        while((n=x.indexOf('W', n+1)) > -1) {
            System.out.println(n);
        }
    }
}