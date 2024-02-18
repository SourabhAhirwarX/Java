class A {
    public static void main(String[] args) {
        int x = 78;

        if(x > 100) {
            System.out.println(x); // this line should not execute if x is not greater than 100
        }
    }
}