class A {
    static int x = 89;
    int z = 20;

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(A.x);  // mainly use it, when we want to access a variable outside the class
       
        A a = new A();
        System.out.println(a.x);
    }
}