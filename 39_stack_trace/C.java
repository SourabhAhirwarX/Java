class A {
    A(char r) {
        System.out.println(1);
        int x = 15/0;
        System.out.println(2);
    }

    A(int e) {
        this('a');
        System.out.println(3);
    }

    A(float r) {
        this(12);
        System.out.println(4);
    }
    
    public static void main(String[] args) {
        System.out.println(5);
        A x = new A(2.5f);
        System.out.println(6);
    }
}