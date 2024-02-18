class A {
    int x = 18;

    static void pro() {
        System.out.println(x);  // error: non-static variable x cannot be referenced from a static context
    }

    public static void main(String[] args) {
        
    }
}