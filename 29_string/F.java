class A {
    public static void main(String[] args) {
        //Case: 1
        int x = 2;
        int y = 2;
        System.out.println(x == y);

        //Case: 2;
        String a = "golu";
        String b = "golu";
        System.out.println(a == b); // points to same objects in string constant pool
    }
}