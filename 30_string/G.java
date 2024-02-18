class A {
    public static void main(String[] args) {
        String s = "mohan";             // object in string constant pool

        String t = s.toUpperCase();     // object in heap

        System.out.println(s);
        System.out.println(t);

        System.out.println(s == t);
    }
}