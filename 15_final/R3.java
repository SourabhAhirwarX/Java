class A {
    public static void main(String[] args) {
        final int x;
        x = 45;

        x = 18; // error: variable x might already have been assigned

        System.out.println(x); 
    }
}