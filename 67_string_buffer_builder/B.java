class A {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");

        System.out.println(str1);

        System.out.println(str1.append("golu"));

        System.out.println(str1.insert(2, 'L'));

        str1.setCharAt(4, 'g');
        System.out.println(str1);
        
        System.out.println(str1.reverse());
    }
}