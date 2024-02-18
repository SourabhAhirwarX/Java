class A {
    public static void main(String[] args) {
        System.out.println("A");

        //local code block ... 
        {
            System.out.println("B");
        }

        System.out.println("C");
    }
}