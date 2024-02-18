class A {
    int size = 19;

    public static void main(String[] args) {
        pro();
    }

    static void pro() {
        System.out.println("Hello");

        // System.out.println(size);      
        // error: non-static variable size cannot be referenced from a static context
    }
}