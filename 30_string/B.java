class A {
    public static void main(String[] args) {
        String s = "ramanna";                           // created in string constant pool

        String t = s.replace('i', 'o'); // created in heap area

        System.out.println(s);
        System.out.println(t);
        System.out.println(s == t);
    }
}