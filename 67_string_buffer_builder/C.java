class A {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");

        System.out.println(str1);
        System.out.println(str1.capacity());
        
        str1.setLength(50);
        System.out.println(str1.capacity());
    }
}