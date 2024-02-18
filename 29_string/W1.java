class A {
    public static void main(String[] args) {
        String s = "om is my friend and he is a singer and he is a gammer and he is a cricketer";

        System.out.println(s.indexOf("is"));
        System.out.println(s.indexOf("is", 4));
        System.out.println(s.indexOf("is", 27));
        System.out.println(s.indexOf("is", 100));
    }
}