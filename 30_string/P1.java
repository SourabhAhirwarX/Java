class A {
    public static void main(String[] args) {
        boolean x = "monu@gmail.com".matches("[\\w-\\.]+@");
        //boolean x = "monu@gmail.com".matches("[\\w-\\.]+@");
        boolean y = "monu#gmail.com".matches("[\\w-\\.]+@");
        //boolean y = "monu@gmail.com".matches("[\\w-\\.]+@");

        System.out.println(x);
        System.out.println(y);
    }
}