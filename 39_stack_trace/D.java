class A {
    int y = 12/0;
    A(char w) {
        System.out.println(1);
    }
    A(int e) {
        this('a');
        System.out.println(3);
    }
    A(float f) {
        this(12);
        System.out.println(4);
    }
    public static void main(String[] args) {
        System.out.println(5);;
        A x = new A(2.34f);
        System.out.println(6);
    }
}