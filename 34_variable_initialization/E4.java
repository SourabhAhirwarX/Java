class A {
    public static void main(String[] args) {
        int y;
        int x = 2;
        if(x<13) {
            y = 34;
        }
        System.out.println(y);      // error: variable y might not have been initialized
    }
}