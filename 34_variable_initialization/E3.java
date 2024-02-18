class A {
    public static void main(String[] args) {
        int y;
        if(12>14) {
            y = 45;
        }
        System.out.println(y);      // error: variable y might not have been initialized
    }
}