class A {
    static int x = 90;
     
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.x); // instance context
        System.out.println(A.x); // class context

        System.out.println(x);  // more better way to access class level variable
    }
}