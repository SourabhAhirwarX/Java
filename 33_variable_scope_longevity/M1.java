class A {
    public static void main(String[] args) {
        System.out.println("A");

        //local code block ... helps to create a block level scope
        {
            int y = 90;  //block scoped variable... not accessible outside block
            System.out.println(y);
        }

        System.out.println("C");
        System.out.println(y);    // error: cannot find symbol
    }
}