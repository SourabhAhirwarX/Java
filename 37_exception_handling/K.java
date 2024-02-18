class A {
    public static void main(String[] args) {
        try {
            pro();
        } catch(StackOverflowError e) {
            System.out.println(e);
        }
        
        System.out.println(12);
    }

    static void pro() {
        pro();
    }
}