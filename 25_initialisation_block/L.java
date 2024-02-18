class A {
    int x = 90;
    
    {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new A();
    }
}