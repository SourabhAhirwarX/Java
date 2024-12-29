class A {
    static int x = 90;      // class level variable

    public static void main(String[] args) {
        System.out.println(x);
        // variable member is accessed directly...
        // the container method will decide the context of such member access
        
        // static method creates class context..

        // you can access a class level (static member) from within a class context
    } 
}