class A {
    static void pro(String[] a, String... y) {
        for(String t : a) {
            System.out.println(t);
        }

        System.out.println("~~~~~~~~~~~~~~~");

        for(String t : y) {
            System.out.println(t);
        }
    }
    
    public static void main(String[] args) {
        pro(new String[]{"a1", "a2", "a3"}, "x1", "x2", "x3", "x4");
    }
}