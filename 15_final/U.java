class Circle {
    int radius;
    static final float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 4;

        Circle c2 = new Circle();
        c1.radius = 9;

        Circle c3 = new Circle();
        c1.radius = 34;

        Circle c4 = new Circle();
        c1.radius = 7;

        // c1.pi = 90;  // we don't want to modify the value of pi so, marked it as final

        System.out.println(c1.pi); // not a good practice
        System.out.println(c2.pi);     // compiler thinks it as Circle.pi
        System.out.println(c3.pi);     // compiler Circle.pi
        System.out.println(c4.pi);     // compiler Circle.pi

        System.out.println(Circle.pi);   // write way of accessing

        System.out.println(pi);     // we are able to call it directly because we are in same class
    }
}