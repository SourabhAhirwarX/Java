class A {
    public static void main(String[] args) {
        String s = "ramanna";

        System.out.println(s.indexOf('a'));                  // 1
        System.out.println(s.indexOf('a', 2));     // 3     it will count from starting, but just start scanning from the given index
        System.out.println(s.indexOf('a', 4));     // 6

        System.out.println(s.indexOf('a', 12));    // -1
    }
}